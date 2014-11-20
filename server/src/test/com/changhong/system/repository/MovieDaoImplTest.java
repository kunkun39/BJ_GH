package com.changhong.system.repository;

import com.changhong.system.domain.movietype.*;
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

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午11:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/database.xml", "/applicationContext.xml"})
public class MovieDaoImplTest extends TestCase {

    @Resource
    SessionFactory sessionFactory;

    @Resource
    MovieDao movieDao;

    HibernateTemplate hibernateTemplate;

    @Before
    public void setUp() {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @After
    public void tearDown() {
        hibernateTemplate = null;
    }

    @Test
    public void testSaveTypeEntity() {
        Type type = new Type();
        type.setTypeID("1");
        type.setType("\u7535\u5f71");
        type.setTypeSequence(1);
        type.setDramaType("1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,18,23,29,43,45,49,50,54,55,57,60,66,67,68,70,74,78,80,84");
        hibernateTemplate.save(type);
    }

    @Test
    public void testSaveDramaTypeEntity() {
        DramaType dramaType = new DramaType();
        dramaType.setDramaTypeID("1");
        dramaType.setDramaType("\u7535\u5f71");
        dramaType.setDramaTypeSequence(1);
        hibernateTemplate.save(dramaType);
    }

    @Test
    public void testSaveAreaEntity() {
        Area area = new Area();
        area.setAreaID("1");
        area.setArea("大陆");
        area.setAreaGroupID("1,2,3,4,5,6,7,8,9,10");
        hibernateTemplate.save(area);
    }

    @Test
    public void testSaveAreaGroupEntity() {
        AreaGroup areaGroup = new AreaGroup();
        areaGroup.setAreaGroupID("1");
        areaGroup.setAreaGroup("大陆,港台");
        hibernateTemplate.save(areaGroup);
    }

    @Test
    public void testSaveClientTypeEntity() {
        ClientType clientType = new ClientType();
        clientType.setClientTypeID("1");
        clientType.setClientType("苹果");
        hibernateTemplate.save(clientType);
    }

    @Test
    public void testSaveChannelTypeEntity() {
        ChannelType channelType = new ChannelType();
        channelType.setChannelTypeID("1");
        channelType.setChannelType("CNTV");
        hibernateTemplate.save(channelType);
    }

    @Test
    public void testSaveEventTypeEntity() {
        EventType eventType = new EventType();
        eventType.setEventTypeID("1");
        eventType.setEventType("LUCHEYE");
        hibernateTemplate.save(eventType);
    }

    @Test
    public void testSaveProviderEntity() {
        Provider provider = new Provider();
        provider.setProviderID("1");
        provider.setProviderName("CNTV");
        provider.setProviderType("OK");
        hibernateTemplate.save(provider);
    }
}
