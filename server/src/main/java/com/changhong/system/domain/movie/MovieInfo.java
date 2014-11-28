package com.changhong.system.domain.movie;

import com.changhong.common.domain.EntityBase;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午10:25
 */
public class MovieInfo extends EntityBase {

    /**
     * Column info
     */
    private String columnID;
    private String recommendPage; //INDEX, VOD, CHANNEL...
    private boolean recommend;

    /**
     * MovieInfo
     */
    private String movieID;
    private String movieName;
    private String movieAliasName;
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
     * 播放的资源
     */
    private List<PlayInfo> playInfos;

    /**
     * 海报资源
     */
    private List<Poster> posters;

    public void addPlayInfo(PlayInfo playInfo) {
        if (playInfos == null) {
            playInfos = new ArrayList<PlayInfo>();
        }
        playInfos.add(playInfo);
    }

    public void addPoster(Poster poster) {
        if (posters == null) {
            posters = new ArrayList<Poster>();
        }
        posters.add(poster);
    }

    public PlayInfo getTVPlayInfo() {
        if (playInfos != null) {
            for (PlayInfo playInfo : playInfos) {
                if (playInfo.getPlayPlatform().equals("TV")) {
                    return playInfo;
                }
            }
        }
        return null;
    }

    public Poster getTVPlayPoster() {
        if (posters != null) {
            for (Poster poster : posters) {
                if (poster.getAspectRatio().equals("10240768")) {
                    return poster;
                }
            }
        }
        return null;
    }

    /************************************************GETTER/SETTER*****************************************************/

    public String getColumnID() {
        return columnID;
    }

    public void setColumnID(String columnID) {
        this.columnID = columnID;
    }

    public String getRecommendPage() {
        return recommendPage;
    }

    public void setRecommendPage(String recommendPage) {
        this.recommendPage = recommendPage;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

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

    public List<PlayInfo> getPlayInfos() {
        return playInfos;
    }

    public void setPlayInfos(List<PlayInfo> playInfos) {
        this.playInfos = playInfos;
    }

    public List<Poster> getPosters() {
        return posters;
    }

    public void setPosters(List<Poster> posters) {
        this.posters = posters;
    }
}
