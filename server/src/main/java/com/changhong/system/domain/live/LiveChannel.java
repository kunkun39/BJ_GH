package com.changhong.system.domain.live;

import com.changhong.common.domain.EntityBase;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-20
 * Time: 上午10:34
 * To change this template use File | Settings | File Templates.
 */
public class LiveChannel extends EntityBase{
    private int channelID;
    private String channelName;
    private String dvb_TSID;
    private String dvb_ServiceID;
    private String dvb_NetworkID;
    private String dvb_LogicChannelID;
    private String dvb_VideoCodec;
    private String dvb_AudioCodec;
    private String dec;
    private String dvb_BitRate;
    private String dvb_Resolution;
    private String channelTypeID;
    private String channelType;
    private String channelIcon;
    private String channelImage;
    private String videoType;
    private String feeType;
    private String videoCodeInfo;
    private String audioCodeInfo;
    private String muxInfo;
    private String bitRateInfo;
    private String resolutionInfo;
    private String otherInfoArray;
    private String playUrl;



    /************************************************GETTER/SETTER*****************************************************/

    public int getChannelID() {
        return channelID;
    }

    public void setChannelID(int channelID) {
        this.channelID = channelID;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getDvb_TSID() {
        return dvb_TSID;
    }

    public void setDvb_TSID(String dvb_TSID) {
        this.dvb_TSID = dvb_TSID;
    }

    public String getDvb_ServiceID() {
        return dvb_ServiceID;
    }

    public void setDvb_ServiceID(String dvb_ServiceID) {
        this.dvb_ServiceID = dvb_ServiceID;
    }

    public String getDvb_NetworkID() {
        return dvb_NetworkID;
    }

    public void setDvb_NetworkID(String dvb_NetworkID) {
        this.dvb_NetworkID = dvb_NetworkID;
    }

    public String getDvb_LogicChannelID() {
        return dvb_LogicChannelID;
    }

    public void setDvb_LogicChannelID(String dvb_LogicChannelID) {
        this.dvb_LogicChannelID = dvb_LogicChannelID;
    }

    public String getDvb_VideoCodec() {
        return dvb_VideoCodec;
    }

    public void setDvb_VideoCodec(String dvb_VideoCodec) {
        this.dvb_VideoCodec = dvb_VideoCodec;
    }

    public String getDvb_AudioCodec() {
        return dvb_AudioCodec;
    }

    public void setDvb_AudioCodec(String dvb_AudioCodec) {
        this.dvb_AudioCodec = dvb_AudioCodec;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getDvb_BitRate() {
        return dvb_BitRate;
    }

    public void setDvb_BitRate(String dvb_BitRate) {
        this.dvb_BitRate = dvb_BitRate;
    }

    public String getDvb_Resolution() {
        return dvb_Resolution;
    }

    public void setDvb_Resolution(String dvb_Resolution) {
        this.dvb_Resolution = dvb_Resolution;
    }

    public String getChannelTypeID() {
        return channelTypeID;
    }

    public void setChannelTypeID(String channelTypeID) {
        this.channelTypeID = channelTypeID;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getChannelIcon() {
        return channelIcon;
    }

    public void setChannelIcon(String channelIcon) {
        this.channelIcon = channelIcon;
    }

    public String getChannelImage() {
        return channelImage;
    }

    public void setChannelImage(String channelImage) {
        this.channelImage = channelImage;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getVideoCodeInfo() {
        return videoCodeInfo;
    }

    public void setVideoCodeInfo(String videoCodeInfo) {
        this.videoCodeInfo = videoCodeInfo;
    }

    public String getAudioCodeInfo() {
        return audioCodeInfo;
    }

    public void setAudioCodeInfo(String audioCodeInfo) {
        this.audioCodeInfo = audioCodeInfo;
    }

    public String getMuxInfo() {
        return muxInfo;
    }

    public void setMuxInfo(String muxInfo) {
        this.muxInfo = muxInfo;
    }

    public String getBitRateInfo() {
        return bitRateInfo;
    }

    public void setBitRateInfo(String bitRateInfo) {
        this.bitRateInfo = bitRateInfo;
    }

    public String getResolutionInfo() {
        return resolutionInfo;
    }

    public void setResolutionInfo(String resolutionInfo) {
        this.resolutionInfo = resolutionInfo;
    }

    public String getOtherInfoArray() {
        return otherInfoArray;
    }

    public void setOtherInfoArray(String otherInfoArray) {
        this.otherInfoArray = otherInfoArray;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }
}
