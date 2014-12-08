package com.changhong.system.service;





import com.changhong.common.repository.HibernateEntityObjectDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-12-4
 * Time: 下午1:58
 * To change this template use File | Settings | File Templates.
 */
@Service("schedulerService")
public class SchedulerServiceImpl extends HibernateEntityObjectDao implements SchedulerService{

    @Resource(name = "liveUpdateService")
    private LiveUpdateService liveUpdateService;

    public void renewProgramHistory() {
        Session session=getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery query=session.createSQLQuery("select channel_id from live_channel");
        List<Integer> list=query.list();
        for (Integer channelID:list){
            liveUpdateService.updateLiveProgram(channelID,null,new Date().toString());
        }
        System.out.println("执行定时任务");
//        liveUpdateService.updateLiveProgram(channelID,eventType,date);


    }

}
