package com.changhong.system.service;

/**
 * User: maren
 * Date: 14-12-4
 * Time: 下午1:57
 */

public interface SchedulerService {

    /**
     * 用于每天更新最新的节目信息，根据频道来更新
     */
    void renewProgramHistory();
}
