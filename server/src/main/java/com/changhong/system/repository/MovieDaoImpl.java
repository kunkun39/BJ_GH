package com.changhong.system.repository;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.common.repository.HibernateEntityObjectDao;
import com.changhong.common.utils.JodaUtils;
import com.changhong.common.utils.PagingUtils;
import com.changhong.system.domain.movielist.MovieInfo;
import com.changhong.system.domain.movietype.TypeEnum;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午11:30
 */
@Repository("movieDao")
public class MovieDaoImpl  extends HibernateEntityObjectDao implements MovieDao {

    public String findIndexRecommend(String page, int size) {
        return "";
    }

    public String findMovieType(TypeEnum type) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();

        /**
         * 返回的结果
         */
        JSONObject result = new JSONObject();
        JSONArray items = new JSONArray();

        /**
         * 查询并组装结果
         */
        SQLQuery query = null;
        List list = null;
        if (TypeEnum.TYPE.equals(type)) {
            query = session.createSQLQuery("SELECT type_id,type_name,type_sequence,drama_type_id FROM movie_type ORDER BY type_sequence ASC");
            list = query.list();
            for (Object loop : list) {
                JSONObject item = new JSONObject();
                Object[] values = (Object[]) loop;
                item.put("ID", values[0]);
                item.put("Name", values[1]);
                item.put("TypeSequence", values[2]);
                item.put("DramaTypeIDs", values[3]);
                items.add(item);
            }
            result.put("Type", items);

        } else if (TypeEnum.DatamaType.equals(type)) {
            query = session.createSQLQuery("SELECT drama_type_id,drama_type_name,drama_type_sequence FROM movie_drama_type ORDER BY drama_type_sequence ASC");
            list = query.list();
            for (Object loop : list) {
                JSONObject item = new JSONObject();
                Object[] values = (Object[]) loop;
                item.put("ID", values[0]);
                item.put("Name", values[1]);
                item.put("DramaTypeSequence", values[2]);
                items.add(item);
            }
            result.put("DatamaType", items);

        } else if (TypeEnum.Area.equals(type)) {
            query = session.createSQLQuery("SELECT area_id,area_name,area_group_id FROM movie_area");
            list = query.list();
            for (Object loop : list) {
                JSONObject item = new JSONObject();
                Object[] values = (Object[]) loop;
                item.put("ID", values[0]);
                item.put("Name", values[1]);
                item.put("AreaGroupIDs", values[2]);
                items.add(item);
            }
            result.put("Area", items);

        } else if (TypeEnum.AreaGroup.equals(type)) {
            query = session.createSQLQuery("SELECT area_group_id,area_group_name FROM movie_area_group");
            list = query.list();
            for (Object loop : list) {
                JSONObject item = new JSONObject();
                Object[] values = (Object[]) loop;
                item.put("ID", values[0]);
                item.put("Name", values[1]);
                items.add(item);
            }
            result.put("AreaGroup", items);

        } else if (TypeEnum.Year.equals(type)) {
            int year = Integer.valueOf(JodaUtils.toYearString(new DateTime()));
            for (int i = 0; i < 10; i++) {
                year = year - i;
                JSONObject yearItem = new JSONObject();
                yearItem.put("ID", year);
                items.add(yearItem);
                result.put("Year", items);
            }
        } else if (TypeEnum.ClientType.equals(type)) {
            query = session.createSQLQuery("SELECT client_type_id,client_type_name FROM movie_client_type");
            list = query.list();
            for (Object loop : list) {
                JSONObject item = new JSONObject();
                Object[] values = (Object[]) loop;
                item.put("ID", values[0]);
                item.put("Name", values[1]);
                items.add(item);
            }
            result.put("Client", items);
        } else if (TypeEnum.ChannelType.equals(type)) {
            query = session.createSQLQuery("SELECT channel_type_id,channel_type_name FROM movie_channel_type");
            list = query.list();
            for (Object loop : list) {
                JSONObject item = new JSONObject();
                Object[] values = (Object[]) loop;
                item.put("ID", values[0]);
                item.put("Name", values[1]);
                items.add(item);
            }
            result.put("Channel", items);
        } else if (TypeEnum.EventType.equals(type)) {
            query = session.createSQLQuery("SELECT event_type_id,event_type_name FROM movie_event_type");
            list = query.list();
            for (Object loop : list) {
                JSONObject item = new JSONObject();
                Object[] values = (Object[]) loop;
                item.put("ID", values[0]);
                item.put("Name", values[1]);
                items.add(item);
            }
            result.put("Event", items);
        }

        /**
         * 返回结果
         */
        return result.toJSONString();
    }

    public String findColumns() {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();

        /**
         * 返回的结果
         */
        JSONObject result = new JSONObject();
        JSONArray items = new JSONArray();

        /**
         * 查询并组装结果
         */
        SQLQuery query = session.createSQLQuery("SELECT column_id,column_parent_id,column_name,column_alias,column_product_id FROM movie_column ORDER BY column_rank ASC");
        List list = query.list();
        for (Object loop : list) {
            JSONObject item = new JSONObject();
            Object[] values = (Object[]) loop;
            item.put("ColumnID", values[0]);
            item.put("ParentID", values[1]);
            item.put("ColumnName", values[2]);
            item.put("Alias", values[3]);
            item.put("ProductID", values[4]);
            items.add(item);
        }
        result.put("Column", items);

        return result.toJSONString();
    }

    public String findMovies(String query) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery sqlQuery = null;

        /**
         * 解析JSON
         */
        JSONObject queryJSON = JSONObject.parseObject(query);
        JSONObject requestParams = queryJSON.getJSONObject("RequestParams");
        String columnID = requestParams.getString("ColumnID");
        String typeID = requestParams.getString("TypeID");
        String dramaTypeID = requestParams.getString("DramaTypeID");
        String year = requestParams.getString("Year");
        String areaID = requestParams.getString("AreaID");
        String areaGroupID = requestParams.getString("AreaGroupID");
        String currentPage = requestParams.getString("Page");

        /**
         * 构造分页
         */
        sqlQuery = session.createSQLQuery("select count(id) FROM movie_info");
        Object[] count = (Object[]) sqlQuery.list().get(0);
        int numItems = ((Long) count[0]).intValue();
        PagingUtils paging = new PagingUtils(numItems);
        paging.setCurrentPage(currentPage);

        /**
         * 查询MOVIE
         */
        StringBuilder builder = new StringBuilder();
        builder.append("SELECT movie_id,movie_name,movie_alias_name,movie_runtime,movie_suggestprice FROM movie_info WHERE");
        boolean addAnd = false;
        if (StringUtils.hasText(columnID)) {
            addAnd = true;
            builder.append(" column_id='" + columnID + "'");
        }
        if (StringUtils.hasText(typeID)) {
            if (addAnd) {
                builder.append(" AND ");
            }
            addAnd = true;
            builder.append(" movie_type_id='" + typeID + "'");
        }
        if (StringUtils.hasText(dramaTypeID)) {
            if (addAnd) {
                builder.append(" AND ");
            }
            addAnd = true;
            builder.append(" drama_type_id='" + dramaTypeID + "'");
        }
        if (StringUtils.hasText(year)) {
            if (addAnd) {
                builder.append(" AND ");
            }
            addAnd = true;
            builder.append(" movie_year='" + year + "'");
        }
        if (StringUtils.hasText(areaID)) {
            if (addAnd) {
                builder.append(" AND ");
            }
            addAnd = true;
            builder.append(" movie_area_id='" + areaID + "'");
        }
        builder.append(" LIMIT " + paging.getStartPosition() + "," + paging.getPageItems());
        sqlQuery = session.createSQLQuery(builder.toString());
        List list = sqlQuery.list();

        /**
         * 处理返回的结果
         */
        JSONObject result = new JSONObject();
        JSONObject total = new JSONObject();
        total.put("TotalNumber", numItems);
        result.put("ItemNumber", total);

        JSONArray items = new JSONArray();
        for (Object loop : list) {
            JSONObject item = new JSONObject();
            Object[] values = (Object[]) loop;
            item.put("MovieID", values[0]);
            item.put("MovieName", values[1]);
            item.put("MovieAliasName", values[2]);
            item.put("RunTime", values[3]);
            item.put("SuggestPrice", values[4]);
            items.add(item);
        }
        result.put("Items", items);

        return result.toJSONString();
    }

    public String findMovieByID(String movieID) {
        MovieInfo movie = (MovieInfo) getHibernateTemplate().find("FROM MovieInfo m WHERE m.movieID = ?", new Object[]{movieID}).get(0);
        JSONObject result = new JSONObject();

        /**
         * 添加MOVIEINFO信息
         */
        JSONObject movieInfo = new JSONObject();

        movieInfo.put("MovieID", movie.getMovieID());
        movieInfo.put("MovieName", movie.getMovieName());
        movieInfo.put("MovieAliasName", movie.getMovieAliasName());
        movieInfo.put("Area", movie.getArea());
        movieInfo.put("AreaID", movie.getAreaID());
        movieInfo.put("Type", movie.getType());
        movieInfo.put("TypeID", movie.getTypeID());
        movieInfo.put("DramaType", movie.getDramaType());
        movieInfo.put("DramaTypeID", movie.getDramaTypeID());
        movieInfo.put("Year", movie.getYear());
        movieInfo.put("Director", movie.getDirector());
        movieInfo.put("Actor", movie.getActor());
        movieInfo.put("Host", movie.getHost());
        movieInfo.put("Station", movie.getStation());
        movieInfo.put("Author", movie.getAuthor());
        movieInfo.put("RunTime", movie.getRunTime());
        movieInfo.put("Count", movie.getRunTime());
        movieInfo.put("SummaryShort", movie.getSummaryShort());
        movieInfo.put("Commentary", movie.getCommentary());
        movieInfo.put("Tag", movie.getTag());
        movieInfo.put("SuggestPrice", movie.getSuggestPrice());
        movieInfo.put("RecommendClass1", movie.getRecommendClass1());
        movieInfo.put("RecommendClass2", movie.getRecommendClass2());
        movieInfo.put("RecommendClass3", movie.getRecommendClass3());
        movieInfo.put("RecommendClass4", movie.getRecommendClass4());
        movieInfo.put("OtherInfoArray", movie.getOtherInfoArray1());

        result.put("MovieInfo", movieInfo);
        /**
         * 添加PlayInfo信息
         */
        JSONObject playInfo = new JSONObject();

        playInfo.put("PlayPlatform", movie.getPlayPlatform());
        playInfo.put("AssetID", movie.getAssetID());
        playInfo.put("AssetName", movie.getAssetName());
        playInfo.put("ContentProviderID", movie.getContentProviderID());
        playInfo.put("ProductOfferingUID", movie.getProductOfferingUID());
        playInfo.put("PlayUrl", movie.getPlayUrl());
        playInfo.put("PlayUrlID", movie.getPlayUrlID());
        playInfo.put("PlaySwfUrl", movie.getPlaySwfUrl());
        playInfo.put("MainCacheUrl", movie.getMainCacheUrl());
        playInfo.put("Series", movie.getSeries2());
        playInfo.put("SinglePriceInfo", movie.getSinglePriceInfo());
        playInfo.put("CopyRightInfo", movie.getCopyRightInfo());
        playInfo.put("VideoCodecInfo", movie.getVideoCodecInfo());
        playInfo.put("AudioCodecInfo", movie.getAudioCodecInfo());
        playInfo.put("MuxInfo", movie.getMuxInfo());
        playInfo.put("RunTimeInfo", movie.getRunTimeInfo());
        playInfo.put("ResolutionInfo", movie.getResolutionInfo());
        playInfo.put("BitRateInfo", movie.getBitRateInfo());
        playInfo.put("OtherInfoArray", movie.getOtherInfoArray2());
        playInfo.put("ContentProviderIDArray", movie.getContentProviderIDArray());
        playInfo.put("SeriesArray", movie.getSeriesArray());

        result.put("PlayInfo", playInfo);

        /**
         * 添加Poster信息
         */
        JSONObject poster = new JSONObject();

        poster.put("PosterID", movie.getPosterID());
        poster.put("ImageUrl", movie.getImageUrl());
        poster.put("AspectRatio", movie.getAspectRatio());
        poster.put("Series3", movie.getSeries3());

        result.put("Poster", poster);

        /**
         * 返回结果
         */
        return result.toJSONString();
    }

    public String findMovieRecommend(String columnID, String typeID) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        SQLQuery sqlQuery = null;

        /**
         * 查询MOVIE
         */
        StringBuilder builder = new StringBuilder();
        builder.append("SELECT movie_id,movie_name,movie_alias_name,movie_runtime,movie_suggestprice,poster_id,poster_imageurl,poster_aspectratio FROM movie_info");
        builder.append(" WHERE column_id = '" + columnID + "' AND movie_type_id = '" + typeID + "'");
        builder.append(" ORDER BY movie_recommendclass1 DESC");
        builder.append(" LIMIT 5");
        sqlQuery = session.createSQLQuery(builder.toString());
        List list = sqlQuery.list();

        /**
         * 处理返回的结果
         */
        JSONObject result = new JSONObject();
        JSONObject total = new JSONObject();
        total.put("TotalNumber", 5);
        result.put("ItemNumber", total);

        JSONArray items = new JSONArray();
        for (Object loop : list) {
            JSONObject item = new JSONObject();
            Object[] values = (Object[]) loop;
            item.put("MovieID", values[0]);
            item.put("MovieName", values[1]);
            item.put("MovieAliasName", values[2]);
            item.put("RunTime", values[3]);
            item.put("SuggestPrice", values[4]);
            item.put("PosterID", values[5]);
            item.put("ImageUrl", values[6]);
            item.put("AspectRatio", values[7]);
            items.add(item);
        }
        result.put("Items", items);

        return result.toJSONString();
    }
}
