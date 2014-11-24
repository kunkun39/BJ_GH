package com.changhong.client.service;

import com.changhong.system.domain.movietype.TypeEnum;

/**
 * User: Jack Wang
 * Date: 14-11-24
 * Time: 上午9:16
 */
public interface ClientMovieService {

    /**
     * 获得电影的分类
     * @param type All, Type, DatamaType, Area, AreaGroup, Year, 其中之一
     * @return Refer to 点播影片分类JSON输入输出去格式.txt
     */
    String obtainMovieType(TypeEnum type);

    /**
     * 获得所有的栏目
     */
    String obtainColumns();

    /**
     * 根据用户的查询条件获得相应的MOVIE
     *
     * @param queryJSON refer to 点播影片查询JSON输入输出去格式.txt
     * @return refer to 点播影片查询JSON输入输出去格式.txt
     */
    String obtainMovies(String queryJSON);

    /**
     * 通过MOVIE ID获得movie的相信信息
     */
    String obtainMovieByID(String movieID);
}
