package com.changhong.client.service;


import com.changhong.system.repository.LiveDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.PrivateKey;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-24
 * Time: 下午5:56
 * To change this template use File | Settings | File Templates.
 */
@Service("clientLiveProgramService")
public class ClientLiveProgramServiceImpl implements ClientLiveProgramService {
    @Resource(name = "liveDao")
    private LiveDao liveDao;

    public String obtainLiveProgram(int channelID) {
        return liveDao.obtainLiveProgram(channelID);
    }
}
