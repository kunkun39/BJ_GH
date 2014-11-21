package com.changhong.system.web.facade.assember;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.live.LiveChannel;
import com.changhong.system.domain.live.LiveProgramInfo;

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
            liveChannel.setDvb_LogicChannelID(dvbLogicChannelId);
            liveChannel.setDvb_NetworkID(dvbNetworkId);
            liveChannel.setResolutionInfo(dvbResolutionc);
            liveChannel.setDvb_ServiceID(dvbServiceId);
            liveChannel.setDvb_TSID(dvbTSID);
            liveChannel.setDvb_VideoCodec(dvbVideoCodec);
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
            liveChannel.setDvb_BitRate(dvbBitRate);
            channels.add(liveChannel);
        }

        }

         return channels;
    }

    public static List<LiveProgramInfo> toLiveProgramList(String json){
        List<LiveProgramInfo> programInfos=new ArrayList<LiveProgramInfo>();
        JSONObject object=JSON.parseObject(json);
        JSONObject objectResponse=object.getJSONObject("ResponseHeader");
        if(objectResponse.getIntValue("Status")==0){
            JSONObject programItem=object.getJSONObject("ProgramList");
            JSONArray programItems=programItem.getJSONArray("Program_item");
            for (int i=0;i<programItems.size();i++){
                JSONObject program=programItems.getJSONObject(i);
                LiveProgramInfo programInfo=new LiveProgramInfo();
                int programID=program.getIntValue("ProgramID");
                int channelID=program.getIntValue("ChannelID");
                String programName=program.getString("ProgramName");
                String channelName=program.getString("ChannelName");
                String eventDate=program.getString("EventDate");
                String eventDateID=program.getString("EventDateID");
                String eventType=program.getString("eventType");
                String playTime=program.getString("playTime");
                String endTime=program.getString("endTime");
                String eventDesc=program.getString("eventDesc");
                String videoType=program.getString("videoType");
                String viewLevel=program.getString("viewLevel");
                String playUrl=program.getString("playUrl");
                String bitRateInfo=program.getString("bitRateInfo");
                String eventImageUrl=program.getString("eventImageUrl");
                String assertID=program.getString("assertID");
                String contentProvider=program.getString("contentProvider");
                String localEntryUID=program.getString("localEntryUID");
                String productOfferin=program.getString("productOfferin");
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

            }

        }
        return  programInfos;
    }
}
