package com.changhong.system.service;

import com.alibaba.fastjson.JSONObject;
import com.changhong.common.utils.CHStringUtils;
import com.changhong.common.utils.PagingUtils;
import com.changhong.common.utils.WebUtils;
import com.changhong.system.domain.FakeJDONDataProvider;
import com.changhong.system.domain.column.Column;
import com.changhong.system.domain.movielist.MovieInfo;
import com.changhong.system.domain.movietype.*;
import com.changhong.system.repository.MovieDao;
import com.changhong.system.web.facade.assember.MovieColumnJSONAssember;
import com.changhong.system.web.facade.assember.MovieListJSONAssember;
import com.changhong.system.web.facade.assember.MovieTypeJSONAssember;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 下午2:21
 */
@Service("movieUpdateService")
public class MovieUpdateServiceImpl implements MovieUpdateService {

    private final static String TX_FLAG = "CH_"; //例子中给的是 System.currentTimeMillis() +　"_" + 5位随机数

    private final static boolean LOCAL = true;

    @Resource(name="movieDao")
    private MovieDao movieDao;

    public void updateMovieType() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_TYPE_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieClass.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("Class", "type");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<Type> types = MovieTypeJSONAssember.toMovieTypeList(response);
            if (types != null && !types.isEmpty()) {
                movieDao.saveAll(types);
            }
        }
    }

    public void updateMovieDramaType() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_DRAMATYPE_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieClass.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("Class", "dramatype");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<DramaType> types = MovieTypeJSONAssember.toMovieDramaTypeList(response);
            if (types != null && !types.isEmpty()) {
                movieDao.saveAll(types);
            }
        }
    }

    public void updateMovieArea() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_AREA_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieClass.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("Class", "area");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<Area> areas = MovieTypeJSONAssember.toMovieAreaList(response);
            if (areas != null && !areas.isEmpty()) {
                movieDao.saveAll(areas);
            }
        }
    }

    public void updateMovieAreaGroup() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_AREAGROUP_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieClass.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("Class", "areagroup");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<AreaGroup> groups = MovieTypeJSONAssember.toMovieAreaGroupList(response);
            if (groups != null && !groups.isEmpty()) {
                movieDao.saveAll(groups);
            }
        }
    }

    public void updateMovieClientType() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_CLIENTTYPE_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieClass.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("Class", "clienttype");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<ClientType> clients = MovieTypeJSONAssember.toMovieClientTypeList(response);
            if (clients != null && !clients.isEmpty()) {
                movieDao.saveAll(clients);
            }
        }
    }

    public void updateMovieChannelType() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_CHANNELTYPE_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieClass.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("Class", "channeltype");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<ChannelType> channels = MovieTypeJSONAssember.toMovieChannelTypeList(response);
            if (channels != null && !channels.isEmpty()) {
                movieDao.saveAll(channels);
            }
        }
    }

    public void updateMovieEventType() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_EVENTTYPE_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieClass.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("Class", "eventtype");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<EventType> events = MovieTypeJSONAssember.toMovieEventTypeList(response);
            if (events != null && !events.isEmpty()) {
                movieDao.saveAll(events);
            }
        }
    }

    public void updateMovieProvider() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_PROVIDER_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieClass.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("Class", "provider");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<Provider> providers = MovieTypeJSONAssember.toMovieProviderList(response);
            if (providers != null && !providers.isEmpty()) {
                movieDao.saveAll(providers);
            }
        }
    }

    public void updateMovieColumn() {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_INFO_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryColumn.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("ColumnID", "");
            requestParams.put("QueryFlag", "0");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<Column> columns = MovieColumnJSONAssember.toMovieColumnList(response);
            if (columns != null && !columns.isEmpty()) {
                movieDao.saveAll(columns);
            }
        }
    }

    /**
     * 没有事务
     */
    public void getMovieListByColumn(String columnID) {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_INFO_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieList.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("ColumnID", columnID);
            requestParams.put("ClientTypeID", "");//TODO:这个应该是直接从分类那边写死
            requestParams.put("TypeID", "");
            requestParams.put("DramaTypeID", "");
            requestParams.put("Year", "");
            requestParams.put("AreaID", "");
            requestParams.put("AreaGroupID", "");
            requestParams.put("PS", PagingUtils.pageItems);
            requestParams.put("P", "1");
            requestParams.put("Sort", "1");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            int total = MovieListJSONAssember.getTotalMovieSize(response);
            if (total > 0) {
                PagingUtils paging = new PagingUtils(total);
                for (int pageNumber=1; pageNumber<=paging.getNumPages(); pageNumber++) {
                    updateMovieListByPage(columnID, pageNumber);
                }
            }
        }
    }

    private void updateMovieListByPage(String columnID, int pageNumber) {
        String response = null;
        if (LOCAL) {
            response = FakeJDONDataProvider.MOVIE_INFO_DATA;
        } else {
            PostMethod postMethod = new PostMethod("http://172.16.168.115/cmpAdapter/CMPPlugoutAction!queryMovieList.action");
            JSONObject json = new JSONObject();
            JSONObject requestHeader = new JSONObject();
            requestHeader.put("TransactionId", TX_FLAG + CHStringUtils.getRandomString(20));
            requestHeader.put("TransactionTime", System.currentTimeMillis());
            json.put("RequestHeader", requestHeader);
            JSONObject requestParams = new JSONObject();
            requestParams.put("ColumnID", columnID);
            requestParams.put("ClientTypeID", "");//TODO:这个应该是直接从分类那边写死
            requestParams.put("TypeID", "");
            requestParams.put("DramaTypeID", "");
            requestParams.put("Year", "");
            requestParams.put("AreaID", "");
            requestParams.put("AreaGroupID", "");
            requestParams.put("PS", PagingUtils.pageItems);
            requestParams.put("P", pageNumber);
            requestParams.put("Sort", "1");
            json.put("RequestParams", requestParams);
            postMethod.addParameter("json", json.toJSONString());
            response = WebUtils.httpPostRequest(postMethod);
        }

        if (StringUtils.hasText(response)) {
            List<MovieInfo> movies = MovieListJSONAssember.toMovieInfoList(response, columnID);
            if (movies != null && !movies.isEmpty()) {
                movieDao.saveAll(movies);
            }
        }
    }

    public static void main(String[] args) {
        MovieUpdateServiceImpl movieService = new MovieUpdateServiceImpl();
//        movieService.updateMovieType();
//        movieService.updateMovieDramaType();
//        movieService.updateMovieArea();
//        movieService.updateMovieAreaGroup();
//        movieService.updateMovieClientType();
//        movieService.updateMovieChannelType();
//        movieService.updateMovieEventType();
        movieService.updateMovieProvider();
//        movieService.updateMovieColumn();
//        movieService.getMovieListByType("1");
    }
}
