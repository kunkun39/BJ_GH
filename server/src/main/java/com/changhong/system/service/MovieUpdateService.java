package com.changhong.system.service;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 下午2:20
 */
public interface MovieUpdateService {

    void updateMovieType(String id);

    void updateMovieDramaType(String id);

    void updateMovieArea(String id);

    void updateMovieAreaGroup(String id);

    void updateMovieClientType(String id);

    void updateMovieChannelType(String id);

    void updateMovieEventType(String id);

    void updateMovieProvider();

    void updateMovieColumn(String id);

    void getMovieListByColumn(String columnID);
}
