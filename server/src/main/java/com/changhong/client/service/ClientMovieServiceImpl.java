package com.changhong.client.service;

import com.changhong.system.domain.movietype.TypeEnum;
import com.changhong.system.repository.MovieDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: Jack Wang
 * Date: 14-11-24
 * Time: 上午9:16
 */
@Service("clientMovieService")
public class ClientMovieServiceImpl implements ClientMovieService {

    @Resource(name="movieDao")
    private MovieDao movieDao;

    public String obtainMovieType(TypeEnum type) {
        return movieDao.findMovieType(type);
    }

    public String obtainColumns() {
        return movieDao.findColumns();
    }

    public String obtainMovies(String queryJSON) {
        return movieDao.findMovies(queryJSON);
    }

    public String obtainMovieByID(String movieID) {
        return movieDao.findMovieByID(movieID);
    }
}
