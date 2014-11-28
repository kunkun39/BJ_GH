package com.changhong.system.web.facade.assember;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.movie.MovieInfo;
import com.changhong.system.domain.movie.PlayInfo;
import com.changhong.system.domain.movie.Poster;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 下午5:19
 */
public class MovieListJSONAssember {

    public static int getTotalMovieSize(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject total = o.getJSONObject("Item_title");
            return total.getIntValue("TotalNumber");
        }
        return 0;
    }

    public static List<MovieInfo> toMovieInfoList(String json, String columnID) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("Matches");
            JSONArray itemsJSON = typeJSON.getJSONArray("Matches_item");

            List<MovieInfo> movies = new ArrayList<MovieInfo>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);
                JSONObject basic = object.getJSONObject("MovieInfo");

                MovieInfo movie = new MovieInfo();
                movie.setColumnID(columnID);

                /**
                 * 基本信息
                 */
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
                try {
                    movie.setRecommendClass1(basic.getDouble("RecommendClass1"));
                } catch (Exception e) {
                    movie.setRecommendClass1(0);
                }
                try {
                    movie.setRecommendClass2(basic.getDouble("RecommendClass2"));
                } catch (Exception e) {
                    movie.setRecommendClass2(0);
                }
                try {
                    movie.setRecommendClass3(basic.getDouble("RecommendClass3"));
                } catch (Exception e) {
                    movie.setRecommendClass3(0);
                }
                try {
                    movie.setRecommendClass4(basic.getDouble("RecommendClass4"));
                } catch (Exception e) {
                    movie.setRecommendClass4(0);
                }
                movie.setOtherInfoArray1(basic.getString("OtherInfoArray"));

                /**
                 * 播放信息
                 */
                JSONObject play = object.getJSONObject("PlayInfo");
                PlayInfo playInfo = new PlayInfo();
                playInfo.setPlayPlatform(play.getString("PlayPlatform"));
                playInfo.setAssetID(play.getString("AssetID"));
                playInfo.setAssetName(play.getString("AssetName"));
                playInfo.setContentProviderID(play.getString("ContentProviderID"));
                playInfo.setLocalEntryUID("");
                playInfo.setProductOfferingUID(play.getString("ProductOfferingUID"));
                playInfo.setPlayUrl(play.getString("PlayUrl"));
                playInfo.setPlayUrlID(play.getString("PlayUrlID"));
                playInfo.setPlaySwfUrl(play.getString("PlaySwfUrl"));
                playInfo.setMainCacheUrl(play.getString("MainCacheUrl"));
                playInfo.setSeries(play.getString("Series"));
                playInfo.setSinglePriceInfo(play.getString("SinglePriceInfo"));
                playInfo.setCopyRightInfo(play.getString("CopyRightInfo"));
                playInfo.setVideoCodecInfo(play.getString("VideoCodecInfo"));
                playInfo.setAudioCodecInfo(play.getString("AudioCodecInfo"));
                playInfo.setMuxInfo(play.getString("MuxInfo"));
                playInfo.setRunTimeInfo(play.getString("RunTimeInfo"));
                playInfo.setResolutionInfo(play.getString("ResolutionInfo"));
                playInfo.setBitRateInfo(play.getString("BitRateInfo"));
                playInfo.setOtherInfoArray2(play.getString("OtherInfoArray"));
                playInfo.setContentProviderIDArray(play.getString("ContentProviderIDArray"));
                playInfo.setSeriesArray(play.getString("SeriesArray"));
                movie.addPlayInfo(playInfo);

                /**
                 * 海报信息
                 */
                JSONArray posters = object.getJSONArray("Poster");
                JSONObject poster = null;
                if (posters.size() > 0) {
                    poster = posters.getJSONObject(0);
                }
                if (poster != null) {
                    Poster posterInfo = new Poster();
                    posterInfo.setPosterID(poster.getString("PosterID"));
                    posterInfo.setImageUrl(poster.getString("ImageUrl"));
                    posterInfo.setAspectRatio(poster.getString("AspectRatio"));
                    posterInfo.setSeries(poster.getString("Series"));
                    movie.addPoster(posterInfo);
                }

                movies.add(movie);
            }

            return movies;
        }

        return null;
    }

    public static MovieInfo toMovieDetailInfo(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("Movie_list");
            JSONArray itemsJSON = typeJSON.getJSONArray("Movie_item");

            JSONObject object = itemsJSON.getJSONObject(0);
            JSONObject basic = object.getJSONObject("MovieInfo");

            MovieInfo movie = new MovieInfo();
            //movie.setColumnID(columnID);//TODO:影片详情中没有这个字段

            /**
             * 基本信息
             */
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
            try {
                movie.setRecommendClass1(basic.getDouble("RecommendClass1"));
            } catch (Exception e) {
                movie.setRecommendClass1(0);
            }
            try {
                movie.setRecommendClass2(basic.getDouble("RecommendClass2"));
            } catch (Exception e) {
                movie.setRecommendClass2(0);
            }
            try {
                movie.setRecommendClass3(basic.getDouble("RecommendClass3"));
            } catch (Exception e) {
                movie.setRecommendClass3(0);
            }
            try {
                movie.setRecommendClass4(basic.getDouble("RecommendClass4"));
            } catch (Exception e) {
                movie.setRecommendClass4(0);
            }
            movie.setOtherInfoArray1(basic.getString("OtherInfoArray"));

            /**
             * 播放信息
             */
            JSONObject list = object.getJSONObject("Playinfo_list");
            JSONArray plays = list.getJSONArray("Playinfo_item");
            for (int i = 0; i < plays.size(); i++) {
                JSONObject play = plays.getJSONObject(i);
                PlayInfo playInfo = new PlayInfo();
                playInfo.setPlayPlatform(play.getString("PlayPlatform"));
                playInfo.setAssetID(play.getString("AssetID"));
                playInfo.setAssetName(play.getString("AssetName"));
                playInfo.setContentProviderID(play.getString("ContentProviderID"));
                playInfo.setLocalEntryUID("");
                playInfo.setProductOfferingUID(play.getString("ProductOfferingUID"));
                playInfo.setPlayUrl(play.getString("PlayUrl"));
                playInfo.setPlayUrlID(play.getString("PlayUrlID"));
                playInfo.setPlaySwfUrl(play.getString("PlaySwfUrl"));
                playInfo.setMainCacheUrl(play.getString("MainCacheUrl"));
                playInfo.setSeries(play.getString("Series"));
                playInfo.setSinglePriceInfo(play.getString("SinglePriceInfo"));
                playInfo.setCopyRightInfo(play.getString("CopyRightInfo"));
                playInfo.setVideoCodecInfo(play.getString("VideoCodecInfo"));
                playInfo.setAudioCodecInfo(play.getString("AudioCodecInfo"));
                playInfo.setMuxInfo(play.getString("MuxInfo"));
                playInfo.setRunTimeInfo(play.getString("RunTimeInfo"));
                playInfo.setResolutionInfo(play.getString("ResolutionInfo"));
                playInfo.setBitRateInfo(play.getString("BitRateInfo"));
                playInfo.setOtherInfoArray2(play.getString("OtherInfoArray"));
                playInfo.setContentProviderIDArray(play.getString("ContentProviderIDArray"));
                playInfo.setSeriesArray(play.getString("SeriesArray"));
                movie.addPlayInfo(playInfo);
            }

            /**
             * 海报信息
             */
            JSONObject postersList = object.getJSONObject("Poster_list");
            if (postersList != null) {
                JSONArray posters = postersList.getJSONArray("Poster_item");
                if (posters != null) {
                    for (int i = 0; i < plays.size(); i++) {
                        JSONObject poster = posters.getJSONObject(i);
                        Poster posterInfo = new Poster();
                        posterInfo.setPosterID(poster.getString("PosterID"));
                        posterInfo.setImageUrl(poster.getString("ImageUrl"));
                        posterInfo.setAspectRatio(poster.getString("AspectRatio"));
                        posterInfo.setSeries(poster.getString("Series"));
                        movie.addPoster(posterInfo);
                    }
                }
            }

            return movie;
        }

        return null;
    }

    public static PlayInfo toMoviePlayInfo(String json, String assetID, String playUrlID) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("Movie_list");
            JSONArray itemsJSON = typeJSON.getJSONArray("Movie_item");
            JSONObject object = itemsJSON.getJSONObject(0);
            /**
             * 播放信息
             */
            JSONObject list = object.getJSONObject("Playinfo_list");
            JSONArray plays = list.getJSONArray("Playinfo_item");
            for (int i = 0; i < plays.size(); i++) {
                JSONObject play = plays.getJSONObject(i);
                PlayInfo playInfo = null;
                String assetIDJSON = play.getString("AssetID");
                String playUrlIDJSON = play.getString("PlayUrlID");

                if(assetIDJSON.equals(assetID) && playUrlIDJSON.equals(playUrlID)) {
                    playInfo = new PlayInfo();
                    playInfo.setPlayPlatform(play.getString("PlayPlatform"));
                    playInfo.setAssetID(assetIDJSON);
                    playInfo.setAssetName(play.getString("AssetName"));
                    playInfo.setContentProviderID(play.getString("ContentProviderID"));
                    playInfo.setLocalEntryUID("");
                    playInfo.setProductOfferingUID(play.getString("ProductOfferingUID"));
                    playInfo.setPlayUrl(play.getString("PlayUrl"));
                    playInfo.setPlayUrlID(playUrlIDJSON);
                    playInfo.setPlaySwfUrl(play.getString("PlaySwfUrl"));
                    playInfo.setMainCacheUrl(play.getString("MainCacheUrl"));
                    playInfo.setSeries(play.getString("Series"));
                    playInfo.setSinglePriceInfo(play.getString("SinglePriceInfo"));
                    playInfo.setCopyRightInfo(play.getString("CopyRightInfo"));
                    playInfo.setVideoCodecInfo(play.getString("VideoCodecInfo"));
                    playInfo.setAudioCodecInfo(play.getString("AudioCodecInfo"));
                    playInfo.setMuxInfo(play.getString("MuxInfo"));
                    playInfo.setRunTimeInfo(play.getString("RunTimeInfo"));
                    playInfo.setResolutionInfo(play.getString("ResolutionInfo"));
                    playInfo.setBitRateInfo(play.getString("BitRateInfo"));
                    playInfo.setOtherInfoArray2(play.getString("OtherInfoArray"));
                    playInfo.setContentProviderIDArray(play.getString("ContentProviderIDArray"));
                    playInfo.setSeriesArray(play.getString("SeriesArray"));

                    return playInfo;
                }
            }
        }

        return null;
    }
}
