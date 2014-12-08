package com.changhong.system.service;

import com.alibaba.fastjson.JSONObject;
import com.changhong.common.utils.CHStringUtils;
import com.changhong.common.utils.WebUtils;
import com.changhong.system.domain.FakeJDONDataProvider;
import com.changhong.system.domain.GHUpdateUrl;
import com.changhong.system.domain.live.*;
import com.changhong.system.domain.live.ProgramUpdateHistory;
import com.changhong.system.repository.LiveDao;
import com.changhong.system.web.facade.assember.LiveJSONAssember;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * User: maren
 * Date: 14-11-20
 * Time: 下午6:39
 */
@Service("liveUpdateService")
public class LiveUpdateServiceImpl implements LiveUpdateService {

    private final static String TX_FLAG = "CH_"; //例子中给的 是 System.currentTimeMillis() +　"_" + 5位随机数

    private final static boolean LOCAL = true;

    @Resource(name = "liveDao")
    private LiveDao liveDao;

    public void updateLiveChannel(String chanenlID, String channeType) {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.LIVE_CHANNEL_DATA;
        } else {
            PostMethod postMethod = new PostMethod(GHUpdateUrl.CHANNEL_UPDATE_URL);
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            if (StringUtils.hasText(chanenlID)) {
                requestParams.put("ChannelID", chanenlID);
            }
            if (StringUtils.hasText(channeType)) {
                requestParams.put("ChannelTypeID", channeType);
            }
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<LiveChannel> channels = LiveJSONAssember.toLiveChannelList(response);
            if (channels != null && !channels.isEmpty()) {
                liveDao.saveAll(channels);
            }
        }
    }

    public void updateLiveProgram(int channelID, String eventTypeID, String date) {
        String response = null;

        if (LOCAL) {
            response = FakeJDONDataProvider.Live_Program_DATA;
        } else {
            PostMethod postMethod = new PostMethod(GHUpdateUrl.PROGRAM_UPDATE_URL);
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            JSONObject requestParams = new JSONObject();
            requestHeader.put("TransanctionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            if (channelID > 0) {
                requestParams.put("ChannelID", channelID);
            }
            if (StringUtils.hasText(eventTypeID)) {
                requestParams.put("EventTypeID", eventTypeID);
            }
            if (StringUtils.hasText(date)) {
                requestParams.put("Date", date);
            }
            requestParams.put("PosterAspectRatio", "10240768");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<LiveProgram> programInfos = LiveJSONAssember.toLiveProgramList(response);
            liveDao.saveAll(programInfos);


            for (LiveProgram programInfo : programInfos) {
                ProgramUpdateHistory programUpdateHistory=new ProgramUpdateHistory();
                programUpdateHistory.setProgramID(programInfo.getProgramID());
                programUpdateHistory.setChannelID(programInfo.getChannelID());
                programUpdateHistory.setUpdateDate(date);
                liveDao.saveOrUpdate(programUpdateHistory);
                System.out.println("complete");
            }
        }
    }
}


