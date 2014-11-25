package com.changhong.system.service;

import com.alibaba.fastjson.JSONObject;
import com.changhong.common.utils.CHStringUtils;
import com.changhong.common.utils.WebUtils;
import com.changhong.system.domain.FakeJDONDataProvider;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgramInfo;
import com.changhong.system.domain.movietype.Type;
import com.changhong.system.repository.LiveChannelDao;
import com.changhong.system.repository.LiveChannelProgramDao;
import com.changhong.system.repository.MovieDao;
import com.changhong.system.web.facade.assember.LiveJSONAssember;
import com.changhong.system.web.facade.assember.MovieTypeJSONAssember;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.poi.util.StringUtil;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.nio.channels.NonWritableChannelException;
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

    @Resource(name = "liveChannelDao")
    private LiveChannelDao liveChannelDao;

    @Resource(name = "LiveChannelProgramDao")
    private LiveChannelProgramDao liveChannelProgramDao;

    public void updateLiveChannel() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.LIVE_CHANNEL_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryChannelList.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("ChannelID", 12);
            requestParams.put("ChannelTypeID", "12");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<LiveChannel> channels = LiveJSONAssember.toLiveChannelList(response);
            if (channels != null && !channels.isEmpty()) {
                liveChannelDao.saveAll(channels);
            }
        }
    }

    public void updateLiveProgram() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.Live_Program_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryProgramList.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            JSONObject requestParams = new JSONObject();
            requestHeader.put("TransanctionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            requestParams.put("ChannelID", 27);
            requestParams.put("EventTypeID", "27");
            requestParams.put("Date", "2013-11-21");
            requestParams.put("PosterAspectRatio", "10240768");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);

        }
        if (StringUtils.hasText(response)) {
            List<LiveProgramInfo> programInfos = new ArrayList<LiveProgramInfo>();
            if (programInfos != null && !programInfos.isEmpty()) {
                liveChannelProgramDao.saveAll(programInfos);

            }

        }
    }

    public void setLiveChannelDao(LiveChannelDao liveChannelDao) {
        this.liveChannelDao = liveChannelDao;

    }

}


