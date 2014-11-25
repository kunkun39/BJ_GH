package com.changhong.system.repository;

import com.changhong.common.repository.EntityObjectDao;
import com.changhong.system.domain.live.LiveChannel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-20
 * Time: 下午2:23
 * To change this template use File | Settings | File Templates.
 */
public interface LiveDao extends EntityObjectDao {

    String loadLiveChannelsByType(String sql);

    List<LiveChannel> loadLiveChannelByID(int id);

    String obtainLiveProgram(int channelID);
}
