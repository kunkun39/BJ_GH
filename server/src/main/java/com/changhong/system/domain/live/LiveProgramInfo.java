package com.changhong.system.domain.live;

import com.changhong.common.domain.EntityBase;

/**
 * Created by IntelliJ IDEA.
 * User: maren
 * Date: 14-11-20
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public class LiveProgramInfo extends EntityBase{
    private int programID;
    private String programName;
    private int channelID;
    private String channelName;
    private String eventDate;
    private String eventDateID;
    private String eventType;
    private String playTime;
    private String endTime;
    private String eventDesc;
    private String videoType;
    private String viewLevel;
    private String playUrl;
    private String bitRateInfo;
    private String eventImageUrl;
    private String assertID;
    private String contentProvider;
    private String localEntryUID;
    private String productOfferin;

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

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

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDateID() {
        return eventDateID;
    }

    public void setEventDateID(String eventDateID) {
        this.eventDateID = eventDateID;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getViewLevel() {
        return viewLevel;
    }

    public void setViewLevel(String viewLevel) {
        this.viewLevel = viewLevel;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getBitRateInfo() {
        return bitRateInfo;
    }

    public void setBitRateInfo(String bitRateInfo) {
        this.bitRateInfo = bitRateInfo;
    }

    public String getEventImageUrl() {
        return eventImageUrl;
    }

    public void setEventImageUrl(String eventImageUrl) {
        this.eventImageUrl = eventImageUrl;
    }

    public String getAssertID() {
        return assertID;
    }

    public void setAssertID(String assertID) {
        this.assertID = assertID;
    }

    public String getContentProvider() {
        return contentProvider;
    }

    public void setContentProvider(String contentProvider) {
        this.contentProvider = contentProvider;
    }

    public String getLocalEntryUID() {
        return localEntryUID;
    }

    public void setLocalEntryUID(String localEntryUID) {
        this.localEntryUID = localEntryUID;
    }

    public String getProductOfferin() {
        return productOfferin;
    }

    public void setProductOfferin(String productOfferin) {
        this.productOfferin = productOfferin;
    }
}
