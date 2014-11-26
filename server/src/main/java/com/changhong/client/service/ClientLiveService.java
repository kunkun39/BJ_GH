package com.changhong.client.service;

/**
 * User: maren
 * Date: 14-11-24
 * Time: 下午5:55
 */
public interface ClientLiveService {

    /**
     * 通过频道获得一段时间内所有的节目信息, loadMovieInfo用于判断是否加载Movie的信息
     */
    String obtainLiveProgramEPG(int channelID, boolean loadMovieInfo);

    /**
     * 获得回放的EPG信息
     */
    String obtainRollackProgramEPG(int channelID, boolean loadMovieInfo);
}
