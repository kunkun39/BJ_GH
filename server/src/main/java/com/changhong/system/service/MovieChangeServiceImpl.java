package com.changhong.system.service;

import com.alibaba.fastjson.JSONObject;
import com.changhong.system.repository.MovieDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: Jack Wang
 * Date: 14-11-27
 * Time: 上午9:43
 */
@Service("movieChangeService")
public class MovieChangeServiceImpl implements MovieChangeService {

    private final static String INSERT = "insert";

    private final static String DELETE = "delete";

    @Resource(name="movieUpdateService")
    private MovieUpdateService movieUpdateService;

    @Resource(name="movieDao")
    private MovieDao movieDao;

    public void serverMovieTypeChange(String json) {
        JSONObject request = JSONObject.parseObject(json);
        JSONObject message = request.getJSONObject("message");
        String topic = request.getString("topic");
        String opType = message.getString("OpType");
        String id = message.getString("ID");
        //DOTO:这个是ID还是文档上说的各个类型的ID

        if (INSERT.equals(opType)) {
            if ("UAP.Type".equals(topic)) {
                movieUpdateService.updateMovieType(id);

            } else if ("UAP.Dramatype".equals(topic)) {
                movieUpdateService.updateMovieDramaType(id);

            } else if ("UAP.Area".equals(topic)) {
                movieUpdateService.updateMovieArea(id);

            } else if ("UAP.Areagroup".equals(topic)) {
                movieUpdateService.updateMovieAreaGroup(id);

            } else if ("UAP.ClientType".equals(topic)) {
                movieUpdateService.updateMovieClientType(id);

            } else if ("UAP.ChannelType".equals(topic)) {
                movieUpdateService.updateMovieChannelType(id);

            } else if ("UAP.EventType".equals(topic)) {
                movieUpdateService.updateMovieEventType(id);

            }
        } else if(DELETE.equals(opType)) {
            movieDao.deleteMovieType(topic, id);
        }
    }

    public void serverMovieColumnChange(String json) {
        JSONObject request = JSONObject.parseObject(json);
        JSONObject message = request.getJSONObject("message");
        String topic = request.getString("topic");
        String opType = message.getString("OpType");
        String id = message.getString("ColumnID");

        if (INSERT.equals(opType)) {
            movieUpdateService.updateMovieColumn(id);
        } else if(DELETE.equals(opType)) {
            movieDao.deleteMovieColumn(id);
        }
    }

    public void serverMovieInfoChange(String json) {
        JSONObject request = JSONObject.parseObject(json);
        JSONObject message = request.getJSONObject("message");
        String topic = request.getString("topic");
        String opType = message.getString("OpType");
        String id = message.getString("MovieID");

        if (INSERT.equals(opType)) {
            movieUpdateService.getMovieDetails(id);
        } else if(DELETE.equals(opType)) {
            movieDao.deleteMovieInfo(id);
        }
    }

    public void serverPlayInfoChange(String json) {
        JSONObject request = JSONObject.parseObject(json);
        JSONObject message = request.getJSONObject("message");
        String topic = request.getString("topic");
        String opType = message.getString("OpType");
        String movieID = message.getString("MovieID");
        String playUrlID = message.getString("PlayUrlID");
        String assetID = message.getString("AssetID");

        if (INSERT.equals(opType)) {
            movieUpdateService.getMoviePlayInfo(movieID, assetID, playUrlID);
        } else if(DELETE.equals(opType)) {
            movieDao.deleteMoviePlayInfo(assetID, playUrlID);
        }
    }
}
