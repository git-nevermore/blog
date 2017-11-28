package com.chenwenjie.blog.common.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 基础 Dao 接口定义
 * 
 * @author chenwenjie
 * @since 2017-10-09
 * @param <E>
 * @param <ID>
 */
@NoRepositoryBean
public interface BaseDao<E, ID extends Serializable> extends JpaRepository<E, ID>, JpaSpecificationExecutor<E> {

}