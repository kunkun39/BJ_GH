package com.changhong.system.repository;

import com.changhong.common.repository.EntityObjectDao;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-20
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
@Component
public interface LiveChannelProgramDao extends EntityObjectDao {
    public String obtainLiveProgram(int channelID);



}
