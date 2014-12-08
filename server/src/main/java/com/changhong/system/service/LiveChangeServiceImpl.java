package com.changhong.system.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgram;
import com.changhong.system.repository.LiveDao;
import com.changhong.system.service.LiveUpdateService;
import com.changhong.system.service.MovieUpdateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * User: maren
 * Date: 14-11-27
 * Time: 上午9:38
 */
@Service("liveChangeService")
public class LiveChangeServiceImpl implements LiveChangeService {

    private final static String INSERT = "insert";

    private final static String DELETE = "delete";

    @Resource(name = "liveUpdateService")
    private LiveUpdateService liveUpdateService;

    @Resource(name = "liveDao")
    private LiveDao liveDao;

    public void liveChange(String json) {
        JSONObject jsonObject = JSON.parseObject(json);
        JSONObject message = jsonObject.getJSONObject("message");
        String topic = jsonObject.getString("topic");
        String opType = message.getString("OpType");
        String channelID = message.getString("ChannelID");
        String programID = message.getString("ProgramID");

        if ((opType.trim()).equals(INSERT)) {
            if ("UAP.Channnel".equals(topic)) {
                liveUpdateService.updateLiveChannel(channelID, "");
            } else if ("UAP.Program".equals(topic)) {
                //TODO：没有直接更新节目的接口，所有都只能通过频道来更新
            }

        } else if ((opType.trim()).equals(DELETE)) {
            if ("UAP.Channnel".equals(topic)) {
                liveDao.deleteChannel(channelID);
            } else if ("UAP.Program".equals(topic)) {
                liveDao.deleteProgram(programID);
            }
        }
    }
}
