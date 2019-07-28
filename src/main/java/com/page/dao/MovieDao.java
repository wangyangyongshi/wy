package com.page.dao;

import com.page.Entity.Movie;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author 王二小
 * @date 2019/3/28 0:11
 */
@Repository
public interface MovieDao {

    Integer findOne();
}
