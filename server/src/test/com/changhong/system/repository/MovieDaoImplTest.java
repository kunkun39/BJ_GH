package com.changhong.system.repository;

import com.changhong.system.domain.column.Column;
import com.changhong.system.domain.movielist.MovieInfo;
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

    @Test
    public void testSaveColumnEntity() {
        Column column = new Column();
        column.setColumnID("50046");
        column.setColumnTypeCode("mf");
        column.setType("1");
        column.setParentID("50041");
        column.setColumnName("nice");
        column.setAlias("免费点播");
        column.setDescribe("1");
        column.setDisplay("1");
        column.setRank("5");
        column.setUrl("1");
        column.setUrlType("1");
        column.setUpdateTime("Wed Jul 16 00:00:00 CST 2014");
        column.setRelevantChargeMode("0");
        column.setProductID("1048584");
        column.setResourceType("2");
        hibernateTemplate.save(column);
    }

    @Test
    public void testSaveMovieInfoEntity() {
        MovieInfo movieInfo = new MovieInfo();
        movieInfo.setMovieID("144265");
        movieInfo.setMovieName("\u6e29\u67d4\u6740\u622e");
        movieInfo.setMovieAliasName("\u975e\u6cd5\u4ea4\u6613\\/\u593a\u547d\u65e0\u58f0\\/\u67ef\u6839\u7684\u4ea4\u6613\\/\u6e29\u67d4\u5730\u6740\u6b7b\u4ed6\u4eec\\/\u6740\u622e\u884c\u52a8\\/\u6e29\u67d4\u7684\u6740\u622e\\/Killing Them Softly\\/Cogan\\\\\\'s Trade");
        movieInfo.setType("内陆");
        movieInfo.setTypeID("1");
        movieInfo.setDramaType("战争");
        movieInfo.setDramaTypeID("1,12");
        movieInfo.setArea("\u5185\u5730");
        movieInfo.setAreaID("31");
        movieInfo.setYear("2014");
        movieInfo.setDirector(";\u5b89\u5fb7\u9c81\u00b7\u591a\u7c73\u5c3c\u514b;");
        movieInfo.setActor(";\u5e03\u62c9\u5fb7\u00b7\u76ae\u7279;\u65af\u79d1\u7279\u00b7\u9ea6\u514b\u7eb3\u91cc;\u672c\u00b7\u95e8\u5fb7\u5c14\u68ee;");
        movieInfo.setHost("1");
        movieInfo.setStation("2");
        movieInfo.setAuthor("3");
        movieInfo.setRunTime("97");
        movieInfo.setCount(0);
        movieInfo.setSummaryShort("    \u5e03\u62c9\u5fb7\u00b7\u76ae\u7279\u9970\u6f14\u7684\u6770\u57fa\u00b7\u67ef\u6839\u662f\u4e00\u4f4d\u5f3a\u786c\u7684\u804c\u4e1a\u6267\u6cd5\u4eba\uff0c\u4ed6\u4ecb\u5165\u8c03\u67e5\u4e00\u6869\u62a2\u52ab\u6848\uff0c\u6848\u4ef6\u53d1\u751f\u5728\u4e00\u6b21\u7531\u9ed1\u5e2e\u4fdd\u62a4\u7684\u91cd\u91d1\u6251\u514b\u8d4c\u5c40\u4e2d\u3002");
        movieInfo.setCommentary("\u6781\u9177\u7684\u98ce\u683c\u5316");
        movieInfo.setTag("\u5341\u6708\u9884\u544a");
        movieInfo.setSuggestPrice("6");
        movieInfo.setRecommendClass1(6.1);
        movieInfo.setRecommendClass2(6.1);
        movieInfo.setRecommendClass3(6.1);
        movieInfo.setRecommendClass4(6.1);
        movieInfo.setOtherInfoArray1("4");

        movieInfo.setPlayPlatform("WEB");
        movieInfo.setAssetID("11111");
        movieInfo.setAssetName("111111");
        movieInfo.setContentProviderID("youku");
        movieInfo.setLocalEntryUID("uid");
        movieInfo.setProductOfferingUID("uid");
        movieInfo.setPlayUrl("http:\\/\\/v.youku.com\\/v_show\\/id_XNjIxMTU1Mzg4.html");
        movieInfo.setPlayUrlID("8873125");
        movieInfo.setPlaySwfUrl("http:\\/\\/player.youku.com\\/player.php\\/sid\\/XNjIxMTU1Mzg4\\/v.swf");
        movieInfo.setMainCacheUrl("url");
        movieInfo.setSeries2("2");
        movieInfo.setSinglePriceInfo("30.00");
        movieInfo.setCopyRightInfo("right");
        movieInfo.setVideoCodecInfo("1111");
        movieInfo.setAudioCodecInfo("1111");
        movieInfo.setMuxInfo("mux");
        movieInfo.setRunTimeInfo("120");
        movieInfo.setResolutionInfo("jfoejfoe");
        movieInfo.setBitRateInfo("niejfief");
        movieInfo.setOtherInfoArray2("foejfoe");
        movieInfo.setContentProviderIDArray("youku,tudou");
        movieInfo.setSeriesArray("jfoef");

        movieInfo.setPosterID("11");
        movieInfo.setImageUrl("http:\\/\\/v.youku.com\\/v_show\\/id_XNjIxMTU1Mzg4.html");
        movieInfo.setAspectRatio("34");
        movieInfo.setSeries3("e");

        hibernateTemplate.save(movieInfo);
    }
}
