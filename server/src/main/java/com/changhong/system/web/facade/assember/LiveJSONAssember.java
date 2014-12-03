package com.changhong.system.web.facade.assember;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgram;
import com.changhong.system.domain.movie.MovieInfo;
import com.changhong.system.domain.movie.Poster;

import java.util.ArrayList;
import java.util.List;

/**
 * User: maren
 * Date: 14-11-21
 * Time: 上午9:22
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
                /**
                 * 获得数据
                 */
                int id = object.getIntValue("ChannelID");
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

                /**
                 * 添加数据
                 */
                liveChannel.setChannelID(id);
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
                 * program info
                 */
                LiveProgram item = new LiveProgram();
                JSONObject programInfo1 = program.getJSONObject("ProgramInfo");
                item.setProgramID(programInfo1.getIntValue("ProgramID"));
                item.setChannelID(programInfo1.getIntValue("ChannelID"));
                item.setProgramName(programInfo1.getString("ProgramName"));
                item.setChannelName(programInfo1.getString("ChannelName"));
                item.setEventDate(programInfo1.getString("EventDate"));
                item.setEventDateID(programInfo1.getString("EventDateID"));
                item.setEventType(programInfo1.getString("eventType"));
                item.setPlayTime(programInfo1.getString("playTime"));
                item.setEndTime(programInfo1.getString("endTime"));
                item.setEventDesc(programInfo1.getString("eventDesc"));
                item.setVideoType(programInfo1.getString("videoType"));
                item.setViewLevel(programInfo1.getString("viewLevel"));
                item.setPlayUrl(programInfo1.getString("playUrl"));
                item.setBitRateInfo(programInfo1.getString("bitRateInfo"));
                item.setEventImageUrl(programInfo1.getString("eventImageUrl"));
                item.setAssertID(programInfo1.getString("assertID"));
                item.setContentProviderID(programInfo1.getString("contentProviderID"));
                item.setLocalEntryUID(programInfo1.getString("localEntryUID"));
                item.setProductOfferingUID(programInfo1.getString("productOfferingUID"));

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
                Poster poster = new Poster();
                poster.setPosterID(posterInfo.getString("PosterID"));
                poster.setImageUrl(posterInfo.getString("ImageUrl"));
                poster.setAspectRatio(posterInfo.getString("AspectRatio"));
                poster.setSeries(posterInfo.getString("Series"));
                item.setMovie(movie);

                items.add(item);
            }

        }
        return items;
    }
}
