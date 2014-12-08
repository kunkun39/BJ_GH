package com.changhong.system.repository;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.common.repository.HibernateEntityObjectDao;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgram;
import com.changhong.system.domain.live.ProgramUpdateHistory;
import com.changhong.system.domain.movie.MovieInfo;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: maren
 * Date: 14-11-20
 * Time: 下午2:24
 */
@Repository("liveDao")
public class LiveDaoImpl extends HibernateEntityObjectDao implements LiveDao {
    public boolean findProgramUpdateHistory(int channelID,String date) {
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        SQLQuery query = session.createSQLQuery("select * from program_update_history where channel_id= '" + channelID + "' and update_date= '" +  date + " ' "  );
        List<ProgramUpdateHistory> list=query.list();
        session.close();
        if(list.size()>0){
            return true;
        }else{
            return false;
        }




    }


    public List<Integer> findAllChannelIDs() {
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        SQLQuery query = session.createSQLQuery("SELECT channel_id FROM live_channel");
        List<Integer> list=query.list();
        session.close();
        return list;
    }

    public String loadLiveChannelsByType(String sql) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery query = session.createSQLQuery("select channel_icon,channel_image,channel_type,play_url,fee_type,video_type from live_channel where live_channel.channel_type='高清频道' ");
        List<LiveChannel> liveChannels = query.list();

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
            programJSON.put("ProgramID", program.getProgramID());
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
                if (program.getMovie() != null) {
                    MovieInfo movieInfo = program.getMovie();
                    movieJSON.put("MovieID", movieInfo.getMovieID());
                    movieJSON.put("MovieName", movieInfo.getMovieName());
                    movieJSON.put("MovieAliasName", movieInfo.getMovieAliasName());
                    item.put("MovieInfo", movieJSON);
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

    public void deleteChannel(String channelID) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery query = session.createSQLQuery("DELETE FROM live_channel WHERE channel_id = '" + channelID + "'");
        query.executeUpdate();
    }

    public void deleteProgram(String programID) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery query = session.createSQLQuery("DELETE FROM live_program WHERE program_id = '" + programID + "'");
        query.executeUpdate();
    }
}
