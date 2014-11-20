package com.changhong.system.domain.movielist;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午10:25
 */
public class MovieInfo extends EntityBase {
    /**
     * MovieInfo
     */
    private String movieID;
    private String movieName;
    private String movieAliasName;
    private String productID; //TODO:是不是通过这个字段把Column和MOVIE联系起来的, 最后是不是通过COLUMN来查询所有的MOVIE，然后再更新MOVIE的这个字段
    private String type;
    private String typeID;
    private String dramaType;
    private String dramaTypeID;
    private String area;
    private String areaID;
    private String year;
    private String director;
    private String actor;
    private String host;
    private String station;
    private String author;
    private String runTime;
    private int count;
    private String summaryShort;
    private String commentary;
    private String tag;
    private String suggestPrice;
    private double recommendClass1;
    private double recommendClass2;
    private double recommendClass3;
    private double recommendClass4;
    private String otherInfoArray1;

    /**
     * PlayInfo
     */
    private String playPlatform;
    private String assetID;
    private String assetName;
    private String contentProviderID;
    private String localEntryUID;
    private String productOfferingUID;
    private String playUrl;
    private String playUrlID;
    private String playSwfUrl;
    private String mainCacheUrl;
    private String series2;
    private String singlePriceInfo;
    private String copyRightInfo;
    private String videoCodecInfo;
    private String audioCodecInfo;
    private String muxInfo;
    private String runTimeInfo;
    private String resolutionInfo;
    private String bitRateInfo;
    private String otherInfoArray2;
    private String contentProviderIDArray;
    private String seriesArray;

    /**
     * Poster
     */
    private String posterID;
    private String imageUrl;
    private String aspectRatio;
    private String series3;


    /************************************************GETTER/SETTER*****************************************************/

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieAliasName() {
        return movieAliasName;
    }

    public void setMovieAliasName(String movieAliasName) {
        this.movieAliasName = movieAliasName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getDramaType() {
        return dramaType;
    }

    public void setDramaType(String dramaType) {
        this.dramaType = dramaType;
    }

    public String getDramaTypeID() {
        return dramaTypeID;
    }

    public void setDramaTypeID(String dramaTypeID) {
        this.dramaTypeID = dramaTypeID;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaID() {
        return areaID;
    }

    public void setAreaID(String areaID) {
        this.areaID = areaID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSummaryShort() {
        return summaryShort;
    }

    public void setSummaryShort(String summaryShort) {
        this.summaryShort = summaryShort;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSuggestPrice() {
        return suggestPrice;
    }

    public void setSuggestPrice(String suggestPrice) {
        this.suggestPrice = suggestPrice;
    }

    public double getRecommendClass1() {
        return recommendClass1;
    }

    public void setRecommendClass1(double recommendClass1) {
        this.recommendClass1 = recommendClass1;
    }

    public double getRecommendClass2() {
        return recommendClass2;
    }

    public void setRecommendClass2(double recommendClass2) {
        this.recommendClass2 = recommendClass2;
    }

    public double getRecommendClass3() {
        return recommendClass3;
    }

    public void setRecommendClass3(double recommendClass3) {
        this.recommendClass3 = recommendClass3;
    }

    public double getRecommendClass4() {
        return recommendClass4;
    }

    public void setRecommendClass4(double recommendClass4) {
        this.recommendClass4 = recommendClass4;
    }

    public void setRecommendClass4(int recommendClass4) {
        this.recommendClass4 = recommendClass4;
    }

    public String getOtherInfoArray1() {
        return otherInfoArray1;
    }

    public void setOtherInfoArray1(String otherInfoArray1) {
        this.otherInfoArray1 = otherInfoArray1;
    }

    public String getPlayPlatform() {
        return playPlatform;
    }

    public void setPlayPlatform(String playPlatform) {
        this.playPlatform = playPlatform;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getContentProviderID() {
        return contentProviderID;
    }

    public void setContentProviderID(String contentProviderID) {
        this.contentProviderID = contentProviderID;
    }

    public String getLocalEntryUID() {
        return localEntryUID;
    }

    public void setLocalEntryUID(String localEntryUID) {
        this.localEntryUID = localEntryUID;
    }

    public String getProductOfferingUID() {
        return productOfferingUID;
    }

    public void setProductOfferingUID(String productOfferingUID) {
        this.productOfferingUID = productOfferingUID;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getPlayUrlID() {
        return playUrlID;
    }

    public void setPlayUrlID(String playUrlID) {
        this.playUrlID = playUrlID;
    }

    public String getPlaySwfUrl() {
        return playSwfUrl;
    }

    public void setPlaySwfUrl(String playSwfUrl) {
        this.playSwfUrl = playSwfUrl;
    }

    public String getMainCacheUrl() {
        return mainCacheUrl;
    }

    public void setMainCacheUrl(String mainCacheUrl) {
        this.mainCacheUrl = mainCacheUrl;
    }

    public String getSeries2() {
        return series2;
    }

    public void setSeries2(String series2) {
        this.series2 = series2;
    }

    public String getSinglePriceInfo() {
        return singlePriceInfo;
    }

    public void setSinglePriceInfo(String singlePriceInfo) {
        this.singlePriceInfo = singlePriceInfo;
    }

    public String getCopyRightInfo() {
        return copyRightInfo;
    }

    public void setCopyRightInfo(String copyRightInfo) {
        this.copyRightInfo = copyRightInfo;
    }

    public String getVideoCodecInfo() {
        return videoCodecInfo;
    }

    public void setVideoCodecInfo(String videoCodecInfo) {
        this.videoCodecInfo = videoCodecInfo;
    }

    public String getAudioCodecInfo() {
        return audioCodecInfo;
    }

    public void setAudioCodecInfo(String audioCodecInfo) {
        this.audioCodecInfo = audioCodecInfo;
    }

    public String getMuxInfo() {
        return muxInfo;
    }

    public void setMuxInfo(String muxInfo) {
        this.muxInfo = muxInfo;
    }

    public String getRunTimeInfo() {
        return runTimeInfo;
    }

    public void setRunTimeInfo(String runTimeInfo) {
        this.runTimeInfo = runTimeInfo;
    }

    public String getResolutionInfo() {
        return resolutionInfo;
    }

    public void setResolutionInfo(String resolutionInfo) {
        this.resolutionInfo = resolutionInfo;
    }

    public String getBitRateInfo() {
        return bitRateInfo;
    }

    public void setBitRateInfo(String bitRateInfo) {
        this.bitRateInfo = bitRateInfo;
    }

    public String getOtherInfoArray2() {
        return otherInfoArray2;
    }

    public void setOtherInfoArray2(String otherInfoArray2) {
        this.otherInfoArray2 = otherInfoArray2;
    }

    public String getContentProviderIDArray() {
        return contentProviderIDArray;
    }

    public void setContentProviderIDArray(String contentProviderIDArray) {
        this.contentProviderIDArray = contentProviderIDArray;
    }

    public String getSeriesArray() {
        return seriesArray;
    }

    public void setSeriesArray(String seriesArray) {
        this.seriesArray = seriesArray;
    }

    public String getPosterID() {
        return posterID;
    }

    public void setPosterID(String posterID) {
        this.posterID = posterID;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getSeries3() {
        return series3;
    }

    public void setSeries3(String series3) {
        this.series3 = series3;
    }
}
