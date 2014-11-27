package com.changhong.client.service;


import com.changhong.system.repository.LiveDao;
import org.joda.time.LocalDate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: maren
 * Date: 14-11-24
 * Time: 下午5:56
 */
@Service("clientLiveService")
public class ClientLiveServiceImpl implements ClientLiveService {

    @Resource(name = "liveDao")
    private LiveDao liveDao;

    public String obtainLiveChannelsByType(String type) {
        return liveDao.loadLiveChannelsByType(type);
    }

    public String obtainLiveProgramEPG(int channelID, boolean loadMovieInfo) {
        LocalDate today = new LocalDate();
        String dateFrom = today.toString("YYYY-MM-DD");
        String dateTo = today.plusDays(7).toString("YYYY-MM-DD");
        return liveDao.findLiveProgramEPG(channelID, dateFrom, dateTo, loadMovieInfo);
    }

    public String obtainRollackProgramEPG(int channelID, boolean loadMovieInfo) {
        LocalDate today = new LocalDate();
        String dateFrom = today.minusDays(8).toString("YYYY-MM-DD");
        String dateTo = today.minusDays(1).toString("YYYY-MM-DD");
        return liveDao.findLiveProgramEPG(channelID, dateFrom, dateTo, loadMovieInfo);
    }
}
