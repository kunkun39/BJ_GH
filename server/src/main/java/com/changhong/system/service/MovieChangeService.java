package com.changhong.system.service;

/**
 * User: Jack Wang
 * Date: 14-11-27
 * Time: 上午9:43
 */
public interface MovieChangeService {

    /**
     * 影片分类结构信息的变更
     */
    void serverMovieTypeChange(String json);

    /**
     * 更新影片分类的栏目
     */
    void serverMovieColumnChange(String json);

    /**
     * 更新影片分类的栏目
     */
    void serverMovieInfoChange(String json);

    /**
     * 更新MOVIE的播放资源
     */
    void serverPlayInfoChange(String json);
}
