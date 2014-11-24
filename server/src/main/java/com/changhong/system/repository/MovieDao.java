package com.changhong.system.repository;

import com.changhong.common.repository.EntityObjectDao;
import com.changhong.system.domain.movietype.TypeEnum;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午11:29
 */
public interface MovieDao extends EntityObjectDao {

    String findMovieType(TypeEnum type);

    String findColumns();

    String findMovies(String query);

    String findMovieByID(String movieID);
}
