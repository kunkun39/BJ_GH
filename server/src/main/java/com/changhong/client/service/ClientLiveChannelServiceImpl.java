package com.changhong.client.service;

import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.repository.LiveDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-24
 * Time: 下午3:41
 * To change this template use File | Settings | File Templates.
 */
@Service("ClientLiveChannelService")
public class ClientLiveChannelServiceImpl implements ClientLiveChannelService{
    @Resource
    private LiveDao liveDao;

    public String loadliveChannelsByType(String type) {
        return liveDao.loadLiveChannelsByType(type);
    }

    public String loadliveChannelByID(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
