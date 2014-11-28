package com.changhong.system.service;

import com.alibaba.fastjson.JSONObject;
import com.changhong.common.utils.CHStringUtils;
import com.changhong.common.utils.WebUtils;
import com.changhong.system.domain.FakeJDONDataProvider;
import com.changhong.system.domain.GHUpdateUrl;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgram;
import com.changhong.system.repository.LiveDao;
import com.changhong.system.web.facade.assember.LiveJSONAssember;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-20
 * Time: 下午6:39
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class LiveUpdateServiceImpl implements LiveUpdateService {

    private final static String TX_FLAG = "CH_"; //例子中给的 是 System.currentTimeMillis() +　"_" + 5位随机数

    private final static boolean LOCAL = true;

    @Resource(name = "liveDao")
    private LiveDao liveDao;

    public void updateLiveChannel(int chanenlID,String channeType) {
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
            requestParams.put("ChannelID", chanenlID);
            requestParams.put("ChannelTypeID", channeType);
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

    public void updateLiveProgram(int channelID,String eventTypeID) {
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
            requestParams.put("ChannelID", channelID);
            requestParams.put("EventTypeID", eventTypeID);
            requestParams.put("Date", "2013-11-21");
            requestParams.put("PosterAspectRatio", "10240768");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<LiveProgram> programInfos = LiveJSONAssember.toLiveProgramList(response);
            if (programInfos != null && !programInfos.isEmpty()) {
                liveDao.saveAll(programInfos);
            }
        }
    }
}


