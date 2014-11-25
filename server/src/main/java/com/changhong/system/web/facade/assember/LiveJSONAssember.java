package com.changhong.system.web.facade.assember;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgramInfo;
import com.changhong.system.domain.live.Poster;
import com.changhong.system.domain.live.ProgramItem;
import com.changhong.system.domain.movielist.MovieInfo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-21
 * Time: 上午9:22
 * To change this template use File | Settings | File Templates.
 */
public class LiveJSONAssember {
     public  static List<LiveChannel> toLiveChannelList(String json){
        JSONObject jsonObject= JSON.parseObject(json);
        JSONObject objectResponse=jsonObject.getJSONObject("ResponseHeader");
        List<LiveChannel> channels=new ArrayList<LiveChannel>();
        if(objectResponse.getIntValue("Status")==0){
        JSONObject channel=jsonObject.getJSONObject("ChannelList");
        JSONArray jsonArray=channel.getJSONArray("Channel_item");
        for(int i=0;i<jsonArray.size();i++){
            JSONObject object=jsonArray.getJSONObject(i);
            LiveChannel liveChannel=new LiveChannel();
            int id=object.getIntValue("ChannelID");
            liveChannel.setChannelID(id);

            String dvbBitRate=object.getString("DVBBitRate");
            String dvbLogicChannelId=object.getString("DVBLogicChannelID");
            String dvbNetworkId=object.getString("DVBNetworkID");
            String dvbResolutionc=object.getString("DVBResolution");
            String dvbServiceId=object.getString("DVBServiceID");
            String dvbTSID=object.getString("DVBTSID");
            String dvbVideoCodec=object.getString("DVBVideoCodec");
            String dvbAudioCodec=object.getString("AudioCodecInfo");
            String dvbBitRateInfo=object.getString("BitRateInfo");
            String channelIcon=object.getString("ChannelIcon");
            String channelImage=object.getString("ChannelImage");
            String channelName=object.getString("ChannelName");
            String channelType=object.getString("ChannelType");
            String channelTypeId=object.getString("ChannelTypeID");
            String feeType=object.getString("FeeType");
            String muxInfo=object.getString("MuxInfo");
            String otherInfoArray=object.getString("OtherInfoArray");
            String resolutionInfo=object.getString("ResolutionInfo");
            String videoCodeInfo=object.getString("VideoCodecInfo");
            String videoType=object.getString("VideoType");
            String dvbFrequency=object.getString("DVBFrequency");
            liveChannel.setDvbLogicChannelID(dvbLogicChannelId);
            liveChannel.setDvbNetworkID(dvbNetworkId);
            liveChannel.setResolutionInfo(dvbResolutionc);
            liveChannel.setDvbServiceID(dvbServiceId);
            liveChannel.setDvbTSID(dvbTSID);
            liveChannel.setDvbVideoCodec(dvbVideoCodec);
            liveChannel.setFeeType(feeType);
            liveChannel.setAudioCodeInfo(dvbAudioCodec);
            liveChannel.setChannelName(channelName);
            liveChannel.setBitRateInfo(dvbBitRateInfo);
            liveChannel.setChannelIcon(channelIcon);
            liveChannel.setChannelType(channelType);
            liveChannel.setChannelImage(channelImage);
            liveChannel.setChannelTypeID(channelTypeId);
            liveChannel.setMuxInfo(muxInfo);
            liveChannel.setOtherInfoArray(otherInfoArray);
            liveChannel.setResolutionInfo(resolutionInfo);
            liveChannel.setVideoCodeInfo(videoCodeInfo);
            liveChannel.setVideoType(videoType);
            liveChannel.setDvbBitRate(dvbBitRate);
            channels.add(liveChannel);
        }

        }

         return channels;
    }



    public static List<ProgramItem> toLiveProgramList(String json){
        List<ProgramItem> program_item=new ArrayList<ProgramItem>();
        List<LiveProgramInfo> programInfos=new ArrayList<LiveProgramInfo>();
        List<MovieInfo> movieInfos=new ArrayList<MovieInfo>();

        JSONObject object=JSON.parseObject(json);
        JSONObject objectResponse=object.getJSONObject("ResponseHeader");
        if(objectResponse.getIntValue("Status")==0){
            JSONObject programList=object.getJSONObject("ProgramList");
            JSONArray programItems=programList.getJSONArray("Program_item");

            for (int i=0;i<programItems.size();i++){

                JSONObject program=programItems.getJSONObject(i);

                ProgramItem programItem=new ProgramItem();

                JSONObject programInfo1=program.getJSONObject("ProgramInfo");
                LiveProgramInfo programInfo=new LiveProgramInfo();

                JSONObject basic=program.getJSONObject("MovieInfo");
                MovieInfo movie=new MovieInfo();

                JSONObject posterInfo=program.getJSONObject("Poster");



                int programID=programInfo1.getIntValue("ProgramID");
                int channelID=programInfo1.getIntValue("ChannelID");
                String programName=programInfo1.getString("ProgramName");
                String channelName=programInfo1.getString("ChannelName");
                String eventDate=programInfo1.getString("EventDate");
                String eventDateID=programInfo1.getString("EventDateID");
                String eventType=programInfo1.getString("eventType");
                String playTime=programInfo1.getString("playTime");
                String endTime=programInfo1.getString("endTime");
                String eventDesc=programInfo1.getString("eventDesc");
                String videoType=programInfo1.getString("videoType");
                String viewLevel=programInfo1.getString("viewLevel");
                String playUrl=programInfo1.getString("playUrl");
                String bitRateInfo=programInfo1.getString("bitRateInfo");
                String eventImageUrl=programInfo1.getString("eventImageUrl");
                String assertID=programInfo1.getString("assertID");
                String contentProvider=programInfo1.getString("contentProvider");
                String localEntryUID=programInfo1.getString("localEntryUID");
                String productOfferin=programInfo1.getString("productOfferin");
                programInfo.setProgramID(programID);
                programInfo.setChannelID(channelID);
                programInfo.setProgramName(programName);
                programInfo.setChannelName(channelName);
                programInfo.setEventDate(eventDate);
                programInfo.setEventDateID(eventDateID);
                programInfo.setEventType(eventType);
                programInfo.setPlayTime(playTime);
                programInfo.setEndTime(endTime);
                programInfo.setEventDesc(eventDesc);
                programInfo.setVideoType(videoType);
                programInfo.setViewLevel(viewLevel);
                programInfo.setPlayUrl(playUrl);
                programInfo.setBitRateInfo(bitRateInfo);
                programInfo.setEventImageUrl(eventImageUrl);
                programInfo.setAssertID(assertID);
                programInfo.setContentProvider(contentProvider);
                programInfo.setLocalEntryUID(localEntryUID);
                programInfo.setProductOfferin(productOfferin);
                programInfos.add(programInfo);




                movie.setMovieID(basic.getString("MovieID"));
                movie.setMovieName(basic.getString("MovieName"));
                movie.setMovieAliasName(basic.getString("MovieAliasName"));
                movie.setTypeID(basic.getString("TypeID"));
                movie.setType(basic.getString("Type"));
                movie.setDramaTypeID(basic.getString("DramaTypeID"));
                movie.setDramaType(basic.getString("DramaType"));
                movie.setAreaID(basic.getString("AreaID"));
                movie.setArea(basic.getString("Area"));
                movie.setYear(basic.getString("Year"));
                movie.setDirector(basic.getString("Director"));
                movie.setActor(basic.getString("Actor"));
                movie.setHost(basic.getString("Host"));
                movie.setStation(basic.getString("Station"));
                movie.setAuthor(basic.getString("Author"));
                movie.setRunTime(basic.getString("RunTime"));
                movie.setCount(basic.getIntValue("Count"));
                movie.setSummaryShort(basic.getString("SummaryShort"));
                movie.setCommentary(basic.getString("Commentary"));
                movie.setTag(basic.getString("Tag"));
                movie.setSuggestPrice(basic.getString("SuggestPrice"));


                movie.setPosterID(posterInfo.getString("PosterID"));
                movie.setImageUrl(posterInfo.getString("ImageUrl"));
                movie.setAspectRatio(posterInfo.getString("AspectRatio"));
                movie.setSeries3(posterInfo.getString("Series"));
                movieInfos.add(movie);

                programItem.setMovieInfos(movieInfos);
                programItem.setProgramInfos(programInfos);

                program_item.add(programItem);

            }


        }
        return  program_item;
    }

     /**
     * 以json格式数据输出到客户端
     * @param liveChannels
     * @return
     */

    public static JSONObject toChannelJsonObjec(List<LiveChannel> liveChannels){
        JSONArray channelList=new JSONArray();
        for(LiveChannel liveChannel:liveChannels){
            JSONObject channelItem=new JSONObject();
            channelItem.put("ChannelIcon",liveChannel.getChannelIcon());
            channelItem.put("ChannelImage",liveChannel.getChannelImage());
            channelItem.put("ChannelType",liveChannel.getChannelType());
            channelItem.put("PlayUrl",liveChannel.getPlayUrl());
            channelItem.put("FeeType",liveChannel.getFeeType());
            channelItem.put("VideoType",liveChannel.getVideoType());
            channelItem.put("ChannelItem",channelItem);
            channelList.add(channelItem);
        }
        JSONObject channels=new JSONObject();
        channels.put("ChannelList",channelList);
        return channels;

    }

    public static JSONObject toProgramJsonObject(List<LiveProgramInfo> liveProgramInfos){
        JSONArray liveProgramList=new JSONArray();
        for(LiveProgramInfo liveProgramInfo:liveProgramInfos){
            JSONObject programItem=new JSONObject();
            JSONObject liveProgram=new JSONObject();
            programItem.put("ProgramName",liveProgramInfo.getProgramName());
            programItem.put("PlayTime",liveProgramInfo.getPlayTime());
            programItem.put("EndTime",liveProgramInfo.getEndTime());
            programItem.put("EventType",liveProgramInfo.getEventType());
            programItem.put("EventDesc",liveProgramInfo.getEventDesc());
            programItem.put("VideoType",liveProgramInfo.getVideoType());
            programItem.put("ViewLevel",liveProgramInfo.getViewLevel());
            programItem.put("PlayUrl",liveProgramInfo.getPlayUrl());
            programItem.put("EventImageUrl",liveProgramInfo.getEventImageUrl());
            programItem.put("ContentProvider",liveProgramInfo.getContentProvider());
            programItem.put("LocalEntryUID",liveProgramInfo.getLocalEntryUID());
            liveProgram.put("ProgramInfo",programItem);
            liveProgramList.add(liveProgram);

        }
        JSONObject livePrograms=new JSONObject();
        livePrograms.put("ProgramList",liveProgramList);
        return livePrograms;
    }


}
