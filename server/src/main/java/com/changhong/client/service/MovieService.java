package com.changhong.client.service;

/**
 * User: Jack Wang
 * Date: 14-11-24
 * Time: 上午9:16
 */
public interface MovieService {

    /**
     * 获得电影的分类
     * @param type All, Type, DatamaType, Area, AreaGroup, Year, 其中之一
     * @return Refer to 点播影片分类JSON输入输出去格式.txt
     */
    String obtainMovieType(String type);
}
