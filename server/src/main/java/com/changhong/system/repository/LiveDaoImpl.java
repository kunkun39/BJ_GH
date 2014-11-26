package com.changhong.system.repository;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.common.repository.HibernateEntityObjectDao;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgram;
import com.changhong.system.domain.movielist.MovieInfo;
import org.hibernate.SQLQuery;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * User: maren
 * Date: 14-11-20
 * Time: 下午2:24
 */
@Repository("liveDao")
public class LiveDaoImpl extends HibernateEntityObjectDao implements LiveDao {

    public String loadLiveChannelsByType(String sql) {
        List<LiveChannel> liveChannels;
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery query = null;
        query = session.createSQLQuery("select channel_icon,channel_image,channel_type,play_url,fee_type,video_type from live_channel where live_channel.channel_type='高清频道' ");
        liveChannels = query.list();
        JSONArray channelList = new JSONArray();
        for (Object loop : liveChannels) {
            JSONObject channelItem = new JSONObject();
            Object[] values = (Object[]) loop;
            channelItem.put("ChannelIcon", values[0]);
            channelItem.put("ChannelImage", values[1]);
            channelItem.put("ChannelType", values[2]);
            channelItem.put("PlayUrl", values[3]);
            channelItem.put("FeeType", values[4]);
            channelItem.put("VideoType", values[5]);
            channelItem.put("ChannelItem", channelItem);
            channelList.add(channelItem);
        }
        JSONObject channels = new JSONObject();
        channels.put("ChannelList", channelList);

        return channels.toJSONString();
    }

    public List<LiveChannel> loadLiveChannelByID(int id) {
        List<LiveChannel> liveChannels;
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery query = null;
        query = session.createSQLQuery("select * from live_channel where channel_id = " + id);
        liveChannels = query.list();

        return liveChannels;
    }

    public String findLiveProgramEPG(int channelID, String dateFrom, String dateTo, boolean loadMovieInfo) {
        List<LiveProgram> programs = getHibernateTemplate().find("FROM LiveProgram l WHERE l.channelID = ? AND l.eventDate >= ? AND l.eventDate <= ? ORDER BY l.eventDate ASC",
                new Object[]{channelID, dateFrom, dateTo});

        JSONObject result = new JSONObject();
        JSONArray items = new JSONArray();
        for (LiveProgram program : programs) {
            JSONObject item = new JSONObject();
            /**
             * 组装节目的信息
             */
            JSONObject programJSON = new JSONObject();
            programJSON.put("ProgramID", program.getProgramName());
            programJSON.put("ProgramName", program.getProgramName());
            programJSON.put("EventDate", program.getEventDate());
            programJSON.put("EventType", program.getEventType());
            programJSON.put("EventDesc", program.getEventDesc());
            programJSON.put("PlayTime", program.getPlayTime());
            programJSON.put("EndTime", program.getEndTime());
            programJSON.put("VideoType", program.getVideoType());
            programJSON.put("ViewLevel", program.getViewLevel());
            programJSON.put("PlayUrl", program.getPlayUrl());
            programJSON.put("BitRateInfo", program.getBitRateInfo());
            programJSON.put("EventImageUrl", program.getEventImageUrl());
            programJSON.put("AssetID", program.getAssertID());
            programJSON.put("ContentProviderID", program.getContentProviderID());
            programJSON.put("LocalEntryUID", program.getLocalEntryUID());
            programJSON.put("ProductOfferingUID", program.getProductOfferingUID());
            item.put("ProgramInfo", programJSON);

            /**
             * 加载Movie的信息
             */
            if (loadMovieInfo) {
                JSONObject movieJSON = new JSONObject();
                JSONObject posterJSON = new JSONObject();
                if (program.getMovie() != null) {
                    MovieInfo movieInfo = program.getMovie();
                    movieJSON.put("MovieID", movieInfo.getMovieName());
                    movieJSON.put("MovieName", movieInfo.getMovieName());
                    movieJSON.put("MovieAliasName", movieInfo.getMovieName());
                    item.put("MovieInfo", movieJSON);

                    posterJSON.put("ImageUrl", movieInfo.getImageUrl());
                    posterJSON.put("AspectRatio", movieInfo.getAspectRatio());
                    item.put("Poster", posterJSON);
                }
            }

            /**
             * 添加结果
             */
            items.add(item);
        }

        result.put("ProgramList", items);
        return result.toJSONString();
    }
}
