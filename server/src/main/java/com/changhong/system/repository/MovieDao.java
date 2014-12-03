package com.changhong.system.repository;

import com.changhong.common.repository.EntityObjectDao;
import com.changhong.system.domain.movietype.TypeEnum;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午11:29
 */
public interface MovieDao extends EntityObjectDao {

    /********************************************************更新部分***************************************************/

    String findIndexRecommend(String page, int size);

    String findMovieType(TypeEnum type);

    String findColumns(String page);

    String findMovies(String query);

    String findMovieByID(String movieID);

    String findMovieRecommend(String columnID, String typeID);

    /********************************************************变更部分***************************************************/

    void deleteMovieType(String type, String idValue);

    void deleteMovieColumn(String idValue);

    void deleteMovieInfo(String idValue);

    void deleteMoviePlayInfo(String movieID, String playUrlID);
}
