package com.changhong.system.service;

/**
 * User: maren
 * Date: 14-11-20
 * Time: 下午6:37
 */
public interface LiveUpdateService {

    void updateLiveChannel(String channelID, String channelType);

    void updateLiveProgram(int channelID, String eventTypeID);
}
