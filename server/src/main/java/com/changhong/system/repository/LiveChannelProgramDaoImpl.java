package com.changhong.system.repository;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.common.repository.HibernateEntityObjectDao;
import com.changhong.system.domain.live.LiveProgramInfo;
import com.changhong.system.domain.live.ProgramItem;
import com.changhong.system.domain.movielist.MovieInfo;
import org.directwebremoting.json.JsonArray;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-20
 * Time: 下午2:58
 * To change this template use File | Settings | File Templates.
 */
@Repository("liveChannelProgramDao")
public class LiveChannelProgramDaoImpl extends HibernateEntityObjectDao implements LiveChannelProgramDao {
    public String obtainLiveProgram(int channelID) {


        HibernateTemplate hibernateTemplate = getHibernateTemplate();
        List<LiveProgramInfo> programInfos = new ArrayList<LiveProgramInfo>();
        programInfos = hibernateTemplate.find("from LiveProgramInfo lp where lp.channelID=?", new Object[]{channelID});
        JSONArray programs = new JSONArray();
        JSONObject programItem=new JSONObject();
        for(LiveProgramInfo programInfo:programInfos){

            JSONObject program=new JSONObject();
            JSONObject programInfo1=new JSONObject();
            JSONObject movie=new JSONObject();
            JSONObject movieInfo1=new JSONObject();
            program.put("ProgramName",programInfo.getProgramName());
            program.put("Playtime",programInfo.getPlayTime());
            program.put("EventType",programInfo.getEventType());
            program.put("EventDesc",programInfo.getEventDesc());
            program.put("VideoType",programInfo.getVideoType());
            program.put("ViewLevel",programInfo.getViewLevel());
            program.put("PlayUrl",programInfo.getPlayUrl());
            program.put("EventImageUrl",programInfo.getEventImageUrl());
            program.put("ContentProvider",programInfo.getContentProvider());
            program.put("LocalEntryUID",programInfo.getLocalEntryUID());
            if (programInfo.getMovie() != null) {
                MovieInfo movieInfo = programInfo.getMovie();
                movie.put("MovieName", movieInfo.getMovieName());
                movie.put("Type", movieInfo.getType());
                movie.put("DramaType", movieInfo.getDramaType());
                movie.put("Year", movieInfo.getYear());
                movie.put("Actor", movieInfo.getActor());
                movie.put("Author", movieInfo.getAuthor());
                movie.put("RunTime", movieInfo.getRunTime());
                movie.put("Count", movieInfo.getCount());
                movie.put("SummaryShort", movieInfo.getSummaryShort());
                movie.put("Commentary", movieInfo.getCommentary());
                movie.put("SuggestPrice", movieInfo.getSuggestPrice());
                movie.put("RecommendClass1", movieInfo.getRecommendClass1());
                movie.put("RecommendClass2", movieInfo.getRecommendClass2());
                movie.put("RecommendClass3", movieInfo.getRecommendClass3());
                movie.put("RecommendClass3", movieInfo.getRecommendClass4());
                movie.put("ImageUrl", movieInfo.getImageUrl());
                movieInfo1.put("MovieInfo", movie);
                programs.add(movieInfo1);
            }
            programInfo1.put("ProgramInfo", program);
            programs.add(programInfo1);

        }
        programItem.put("Program_item", programs);
        JSONObject programList=new JSONObject();
        programList.put("ProgramList",programItem);
        return programList.toJSONString();
    }
}
