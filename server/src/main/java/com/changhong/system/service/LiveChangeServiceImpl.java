package com.changhong.system.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgram;
import com.changhong.system.repository.LiveDao;
import com.changhong.system.service.LiveUpdateService;import com.changhong.system.service.MovieUpdateService;
import javax.annotation.Resource;



/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-27
 * Time: 上午9:38
 * To change this template use File | Settings | File Templates.
 */
public class LiveChangeServiceImpl implements LiveChangeService{
    private final String INSERT="insert";
    private final String DELETE="delete";

    @Resource(name = "liveUpdateService")
    LiveUpdateService liveUpdateService;

    @Resource(name = "liveDao")
    LiveDao liveDao;

    public void liveChange(String json) {
        JSONObject jsonObject= JSON.parseObject(json);
        JSONObject message=jsonObject.getJSONObject("message");
        String topic=jsonObject.getString("topic");
        String opType=message.getString("OpType");
        String channelID=message.getString("ChannelID");
        String programID=message.getString("ProgramID");
        if((opType.trim()).equals(INSERT)){
            if("UAP.Channnel".equals(topic)){
               liveUpdateService.updateLiveChannel(Integer.parseInt(channelID),null);

            }
            else if("UAP.Program".equals(topic)){
                liveUpdateService.updateLiveProgram(0,null);

            }

        }else if((opType.trim()).equals(DELETE)){
           if("UAP.Channnel".equals(topic)){
               liveDao.delete(liveDao.findById(Integer.parseInt(channelID), LiveChannel.class));

            }
            else if("UAP.Program".equals(topic)){
               liveDao.delete(liveDao.findById(Integer.parseInt(programID), LiveProgram.class));

            }

        }
    }


}
