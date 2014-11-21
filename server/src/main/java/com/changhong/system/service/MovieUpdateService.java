package com.changhong.system.service;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 下午2:20
 */
public interface MovieUpdateService {

    void updateMovieType();

    void updateMovieDramaType();

    void updateMovieArea();

    void updateMovieAreaGroup();

    void updateMovieClientType();

    void updateMovieChannelType();

    void updateMovieEventType();

    void updateMovieProvider();

    void updateMovieColumn();

    void getMovieListByColumn(String movieType);
}
