package com.changhong.system.repository;

import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgramInfo;
import com.changhong.system.service.LiveUpdateServiceImpl;
import com.changhong.system.service.MovieUpdateServiceImpl;
import junit.framework.TestCase;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-20
 * Time: 下午2:28
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/database.xml", "/applicationContext.xml"})
public class LiveChannelImplTest extends TestCase{
     @Resource
     SessionFactory sessionFactory;



    @Resource
    LiveUpdateServiceImpl liveUpdateService;

    HibernateTemplate hibernateTemplate;

    @Before
    public void setUp() {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @After
    public void tearDown() {
        hibernateTemplate = null;

    }
//     @Test
//    public void testSaveLiveChannel(){
//        JsonChannelTest jsonChannelTest=new JsonChannelTest();
//        jsonChannelTest.jsonToObject();
//         List<LiveChannel> channels=jsonChannelTest.channels;
//         for (LiveChannel channel:channels){
//              hibernateTemplate.save(channel);
//         }
//
//
//    }

    @Test
    public void testSaveLiveProgram(){
        liveUpdateService.updateliveProgram();
        liveUpdateService.updateliveChannel();


    }

//     @Test
//    public void testSaveLiveChannelProgram(){
//         LiveProgramInfo liveProgramInfo=new LiveProgramInfo();
//         liveProgramInfo.setBitRateInfo("sssss");
//         liveProgramInfo.setAssertID("2342344");
//         liveProgramInfo.setChannelName("北京卫视");
//         hibernateTemplate.save(liveProgramInfo);
//
//    }

}
