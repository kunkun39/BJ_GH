package com.changhong.system.service;


import com.changhong.common.repository.HibernateEntityObjectDao;
import com.changhong.common.utils.JodaUtils;
import com.changhong.system.domain.live.ProgramUpdateHistory;
import com.changhong.system.domain.movietype.Provider;
import com.changhong.system.repository.LiveDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * User: maren
 * Date: 14-12-4
 * Time: 下午1:58
 */
@Service("schedulerService")
public class SchedulerServiceImpl extends HibernateEntityObjectDao implements SchedulerService {

    @Resource(name = "liveDao")
    private LiveDao liveDao;

    @Resource(name = "liveUpdateService")
    private LiveUpdateService liveUpdateService;

    /**
     * 没有事务
     */
    public void renewProgramHistory() {
        String date = JodaUtils.parseDateTime(new DateTime().toString()).toString();
        List<Integer> channelIDs = liveDao.findAllChannelIDs();
        for (Integer channelID : channelIDs) {
            if (liveDao.findProgramUpdateHistory(channelID, date)) {
                continue;
            } else {
                liveUpdateService.updateLiveProgram(channelID, null, date);
            }


        }
        System.out.println("执行定时任务");
    }

}
