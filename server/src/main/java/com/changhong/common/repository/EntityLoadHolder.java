package com.changhong.common.repository;

import com.changhong.system.repository.LiveChannelDao;
import com.changhong.system.repository.UserDao;

/**
 * User: Jack Wang
 * Date: 14-4-9
 * Time: 下午1:21
 */
public class EntityLoadHolder {

    private static UserDao userDao;
    private static LiveChannelDao liveChannelDao;

    public static LiveChannelDao getLiveChannelDao() {
        return liveChannelDao;
    }

    public static void setLiveChannelDao(LiveChannelDao liveChannelDao) {
        EntityLoadHolder.liveChannelDao = liveChannelDao;
    }

    public static UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
    	EntityLoadHolder.userDao = userDao;
    }

}
