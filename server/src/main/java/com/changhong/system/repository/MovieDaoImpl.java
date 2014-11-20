package com.changhong.system.repository;

import com.changhong.common.repository.HibernateEntityObjectDao;
import org.springframework.stereotype.Repository;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午11:30
 */
@Repository("movieDao")
public class MovieDaoImpl  extends HibernateEntityObjectDao implements MovieDao {
}
