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
    private String dvbTSID;
    private String dvbServiceID;
    private String dvbNetworkID;
    private String dvbLogicChannelID;
    private String dvbVideoCodec;
    private String dvbAudioCodec;
    private String dec;
    private String dvbBitRate;
    private String dvbResolution;
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

    public String getDvbTSID() {
        return dvbTSID;
    }

    public void setDvbTSID(String dvbTSID) {
        this.dvbTSID = dvbTSID;
    }

    public String getDvbServiceID() {
        return dvbServiceID;
    }

    public void setDvbServiceID(String dvbServiceID) {
        this.dvbServiceID = dvbServiceID;
    }

    public String getDvbNetworkID() {
        return dvbNetworkID;
    }

    public void setDvbNetworkID(String dvbNetworkID) {
        this.dvbNetworkID = dvbNetworkID;
    }

    public String getDvbLogicChannelID() {
        return dvbLogicChannelID;
    }

    public void setDvbLogicChannelID(String dvbLogicChannelID) {
        this.dvbLogicChannelID = dvbLogicChannelID;
    }

    public String getDvbVideoCodec() {
        return dvbVideoCodec;
    }

    public void setDvbVideoCodec(String dvbVideoCodec) {
        this.dvbVideoCodec = dvbVideoCodec;
    }

    public String getDvbAudioCodec() {
        return dvbAudioCodec;
    }

    public void setDvbAudioCodec(String dvbAudioCodec) {
        this.dvbAudioCodec = dvbAudioCodec;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getDvbBitRate() {
        return dvbBitRate;
    }

    public void setDvbBitRate(String dvbBitRate) {
        this.dvbBitRate = dvbBitRate;
    }

    public String getDvbResolution() {
        return dvbResolution;
    }

    public void setDvbResolution(String dvbResolution) {
        this.dvbResolution = dvbResolution;
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
