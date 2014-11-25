package com.changhong.system.web.facade.assember;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.movielist.MovieInfo;
import com.changhong.system.domain.movietype.EventType;

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

                JSONObject play = object.getJSONObject("PlayInfo");
                movie.setPlayPlatform(play.getString("PlayPlatform"));
                movie.setAssetID(play.getString("AssetID"));
                movie.setAssetName(play.getString("AssetName"));
                movie.setContentProviderID(play.getString("ContentProviderID"));
                movie.setLocalEntryUID("");
                movie.setProductOfferingUID(play.getString("ProductOfferingUID"));
                movie.setPlayUrl(play.getString("PlayUrl"));
                movie.setPlayUrlID(play.getString("PlayUrlID"));
                movie.setPlaySwfUrl(play.getString("PlaySwfUrl"));
                movie.setMainCacheUrl(play.getString("MainCacheUrl"));
                movie.setSeries2(play.getString("Series"));
                movie.setSinglePriceInfo(play.getString("SinglePriceInfo"));
                movie.setCopyRightInfo(play.getString("CopyRightInfo"));
                movie.setVideoCodecInfo(play.getString("VideoCodecInfo"));
                movie.setAudioCodecInfo(play.getString("AudioCodecInfo"));
                movie.setMuxInfo(play.getString("MuxInfo"));
                movie.setRunTimeInfo(play.getString("RunTimeInfo"));
                movie.setResolutionInfo(play.getString("ResolutionInfo"));
                movie.setBitRateInfo(play.getString("BitRateInfo"));
                movie.setOtherInfoArray2(play.getString("OtherInfoArray"));
                movie.setContentProviderIDArray(play.getString("ContentProviderIDArray"));
                movie.setSeriesArray(play.getString("SeriesArray"));

                JSONArray posters = object.getJSONArray("Poster");
                JSONObject poster = null;
                if (posters.size() > 0) {
                    poster = posters.getJSONObject(0);
                }
                if (poster != null) {
                    movie.setPosterID(poster.getString("PosterID"));
                    movie.setImageUrl(poster.getString("ImageUrl"));
                    movie.setAspectRatio(poster.getString("AspectRatio"));
                    movie.setSeriesArray(poster.getString("Series"));
                }

                movies.add(movie);
            }

            return movies;
        }

        return null;
    }
}
