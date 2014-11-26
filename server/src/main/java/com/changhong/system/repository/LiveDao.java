package com.changhong.system.repository;

import com.changhong.common.repository.EntityObjectDao;
import com.changhong.system.domain.live.LiveChannel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: maren
 * Date: 14-11-20
 * Time: 下午2:23
 */
public interface LiveDao extends EntityObjectDao {

    String loadLiveChannelsByType(String sql);

    String findLiveProgramEPG(int channelID, String dateFrom, String dateTo, boolean loadMovieInfo);
}
