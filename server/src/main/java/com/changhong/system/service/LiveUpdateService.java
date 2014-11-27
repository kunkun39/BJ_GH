package com.changhong.system.service;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-20
 * Time: 下午6:37
 * To change this template use File | Settings | File Templates.
 */
public interface LiveUpdateService {

    void updateLiveChannel(int channelID, String channelType);

    void updateLiveProgram(int channelID, String eventTypeID);
}
