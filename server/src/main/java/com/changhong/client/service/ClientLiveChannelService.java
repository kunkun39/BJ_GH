package com.changhong.client.service;

import com.changhong.system.domain.live.LiveChannel;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-24
 * Time: 下午3:40
 * To change this template use File | Settings | File Templates.
 */
public interface ClientLiveChannelService {
    /**
     * 根据频道类别获得直播频道列表
     * @param type
     * @return
     */
   public String loadliveChannelsByType(String type);


   public String  loadliveChannelByID(int id);
}
