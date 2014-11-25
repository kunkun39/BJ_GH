package com.changhong.system.repository;

import antlr.debug.NewLineListener;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.common.domain.EntityBase;
import com.changhong.common.repository.EntityObjectDao;
import com.changhong.common.repository.HibernateEntityObjectDao;
import com.changhong.system.domain.live.LiveChannel;
import org.hibernate.SQLQuery;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-20
 * Time: 下午2:24
 * To change this template use File | Settings | File Templates.
 */
@Repository("liveChannelDao")
public class LiveChanneDaoImpl extends HibernateEntityObjectDao implements LiveChannelDao{

    public String loadliveChannelsByType(String sql) {
        List<LiveChannel> liveChannels;
        Session session=getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery query=null;
        query=session.createSQLQuery("select channel_icon,channel_image,channel_type,play_url,fee_type,video_type from live_channel where live_channel.channel_type='高清频道' ");
        liveChannels=query.list();
        JSONArray channelList=new JSONArray();
         for(Object loop:liveChannels){
            JSONObject channelItem=new JSONObject();
            Object[] values=(Object[])loop;
            channelItem.put("ChannelIcon",values[0]);
            channelItem.put("ChannelImage",values[1]);
            channelItem.put("ChannelType",values[2]);
            channelItem.put("PlayUrl",values[3]);
            channelItem.put("FeeType",values[4]);
            channelItem.put("VideoType",values[5]);
            channelItem.put("ChannelItem",channelItem);
            channelList.add(channelItem);
        }
        JSONObject channels=new JSONObject();
        channels.put("ChannelList",channelList);

        return channels.toJSONString();
    }

    public List<LiveChannel> loadliveChannelByID(int id) {
        List<LiveChannel> liveChannels;
        Session session=getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery query=null;
        query=session.createSQLQuery("select * from live_channel where channel_id=" + id);
        liveChannels=query.list();

        return  liveChannels;

    }
}
