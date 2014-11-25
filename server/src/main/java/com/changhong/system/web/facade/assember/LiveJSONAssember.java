package com.changhong.system.web.facade.assember;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgram;
import com.changhong.system.domain.movielist.MovieInfo;

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

    public static List<LiveChannel> toLiveChannelList(String json) {
        JSONObject jsonObject = JSON.parseObject(json);
        JSONObject objectResponse = jsonObject.getJSONObject("ResponseHeader");
        List<LiveChannel> channels = new ArrayList<LiveChannel>();
        if (objectResponse.getIntValue("Status") == 0) {
            JSONObject channel = jsonObject.getJSONObject("ChannelList");
            JSONArray jsonArray = channel.getJSONArray("Channel_item");
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject object = jsonArray.getJSONObject(i);
                LiveChannel liveChannel = new LiveChannel();
                int id = object.getIntValue("ChannelID");
                liveChannel.setChannelID(id);

                String dvbBitRate = object.getString("DVBBitRate");
                String dvbLogicChannelId = object.getString("DVBLogicChannelID");
                String dvbNetworkId = object.getString("DVBNetworkID");
                String dvbResolutionc = object.getString("DVBResolution");
                String dvbServiceId = object.getString("DVBServiceID");
                String dvbTSID = object.getString("DVBTSID");
                String dvbVideoCodec = object.getString("DVBVideoCodec");
                String dvbAudioCodec = object.getString("AudioCodecInfo");
                String dvbBitRateInfo = object.getString("BitRateInfo");
                String channelIcon = object.getString("ChannelIcon");
                String channelImage = object.getString("ChannelImage");
                String channelName = object.getString("ChannelName");
                String channelType = object.getString("ChannelType");
                String channelTypeId = object.getString("ChannelTypeID");
                String feeType = object.getString("FeeType");
                String muxInfo = object.getString("MuxInfo");
                String otherInfoArray = object.getString("OtherInfoArray");
                String resolutionInfo = object.getString("ResolutionInfo");
                String videoCodeInfo = object.getString("VideoCodecInfo");
                String videoType = object.getString("VideoType");
                String dvbFrequency = object.getString("DVBFrequency");
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


    public static List<LiveProgram> toLiveProgramList(String json) {
        List<LiveProgram> items = new ArrayList<LiveProgram>();

        JSONObject object = JSON.parseObject(json);
        JSONObject objectResponse = object.getJSONObject("ResponseHeader");
        if (objectResponse.getIntValue("Status") == 0) {
            JSONObject programList = object.getJSONObject("ProgramList");
            JSONArray programItems = programList.getJSONArray("Program_item");

            for (int i = 0; i < programItems.size(); i++) {
                JSONObject program = programItems.getJSONObject(i);
                /**
                 * program
                 */
                LiveProgram liveProgram = new LiveProgram();
                JSONObject programInfo1 = program.getJSONObject("ProgramInfo");
                int programID = programInfo1.getIntValue("ProgramID");
                int channelID = programInfo1.getIntValue("ChannelID");
                String programName = programInfo1.getString("ProgramName");
                String channelName = programInfo1.getString("ChannelName");
                String eventDate = programInfo1.getString("EventDate");
                String eventDateID = programInfo1.getString("EventDateID");
                String eventType = programInfo1.getString("eventType");
                String playTime = programInfo1.getString("playTime");
                String endTime = programInfo1.getString("endTime");
                String eventDesc = programInfo1.getString("eventDesc");
                String videoType = programInfo1.getString("videoType");
                String viewLevel = programInfo1.getString("viewLevel");
                String playUrl = programInfo1.getString("playUrl");
                String bitRateInfo = programInfo1.getString("bitRateInfo");
                String eventImageUrl = programInfo1.getString("eventImageUrl");
                String assertID = programInfo1.getString("assertID");
                String contentProvider = programInfo1.getString("contentProvider");
                String localEntryUID = programInfo1.getString("localEntryUID");
                String productOfferin = programInfo1.getString("productOfferin");
                liveProgram.setProgramID(programID);
                liveProgram.setChannelID(channelID);
                liveProgram.setProgramName(programName);
                liveProgram.setChannelName(channelName);
                liveProgram.setEventDate(eventDate);
                liveProgram.setEventDateID(eventDateID);
                liveProgram.setEventType(eventType);
                liveProgram.setPlayTime(playTime);
                liveProgram.setEndTime(endTime);
                liveProgram.setEventDesc(eventDesc);
                liveProgram.setVideoType(videoType);
                liveProgram.setViewLevel(viewLevel);
                liveProgram.setPlayUrl(playUrl);
                liveProgram.setBitRateInfo(bitRateInfo);
                liveProgram.setEventImageUrl(eventImageUrl);
                liveProgram.setAssertID(assertID);
                liveProgram.setContentProvider(contentProvider);
                liveProgram.setLocalEntryUID(localEntryUID);
                liveProgram.setProductOfferin(productOfferin);

                /**
                 * movie info
                 */
                JSONObject basic = program.getJSONObject("MovieInfo");
                MovieInfo movie = new MovieInfo();
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

                /**
                 * poster
                 */
                JSONObject posterInfo = program.getJSONObject("Poster");
                movie.setPosterID(posterInfo.getString("PosterID"));
                movie.setImageUrl(posterInfo.getString("ImageUrl"));
                movie.setAspectRatio(posterInfo.getString("AspectRatio"));
                movie.setSeries3(posterInfo.getString("Series"));
                liveProgram.setMovie(movie);

                items.add(liveProgram);
            }

        }
        return items;
    }

    /**
     * 以json格式数据输出到客户端
     *
     * @param liveChannels
     * @return
     */

    public static JSONObject toChannelJsonObjec(List<LiveChannel> liveChannels) {
        JSONArray channelList = new JSONArray();
        for (LiveChannel liveChannel : liveChannels) {
            JSONObject channelItem = new JSONObject();
            channelItem.put("ChannelIcon", liveChannel.getChannelIcon());
            channelItem.put("ChannelImage", liveChannel.getChannelImage());
            channelItem.put("ChannelType", liveChannel.getChannelType());
            channelItem.put("PlayUrl", liveChannel.getPlayUrl());
            channelItem.put("FeeType", liveChannel.getFeeType());
            channelItem.put("VideoType", liveChannel.getVideoType());
            channelItem.put("ChannelItem", channelItem);
            channelList.add(channelItem);
        }
        JSONObject channels = new JSONObject();
        channels.put("ChannelList", channelList);
        return channels;

    }

    public static JSONObject toProgramJsonObject(List<LiveProgram> liveProgramInfos) {
        JSONArray liveProgramList = new JSONArray();
        for (LiveProgram liveProgramInfo : liveProgramInfos) {
            JSONObject programItem = new JSONObject();
            JSONObject liveProgram = new JSONObject();
            programItem.put("ProgramName", liveProgramInfo.getProgramName());
            programItem.put("PlayTime", liveProgramInfo.getPlayTime());
            programItem.put("EndTime", liveProgramInfo.getEndTime());
            programItem.put("EventType", liveProgramInfo.getEventType());
            programItem.put("EventDesc", liveProgramInfo.getEventDesc());
            programItem.put("VideoType", liveProgramInfo.getVideoType());
            programItem.put("ViewLevel", liveProgramInfo.getViewLevel());
            programItem.put("PlayUrl", liveProgramInfo.getPlayUrl());
            programItem.put("EventImageUrl", liveProgramInfo.getEventImageUrl());
            programItem.put("ContentProvider", liveProgramInfo.getContentProvider());
            programItem.put("LocalEntryUID", liveProgramInfo.getLocalEntryUID());
            liveProgram.put("ProgramInfo", programItem);
            liveProgramList.add(liveProgram);

        }
        JSONObject livePrograms = new JSONObject();
        livePrograms.put("ProgramList", liveProgramList);
        return livePrograms;
    }


}
