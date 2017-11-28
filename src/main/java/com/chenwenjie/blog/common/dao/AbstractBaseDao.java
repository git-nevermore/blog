package com.chenwenjie.blog.common.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.chenwenjie.blog.common.bean.PageBean;

public abstract class AbstractBaseDao {

	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * 获取分页查询结果对象
	 * 
	 * @param sql SQL语句
	 * @param clazz 待查询对象类型
	 * @param start 查询的第一条数据的位置，从0开始
	 * @param limit 查询数据的数量
	 */
	protected <T> PageBean<T> getPageResponseBean(String sql, Class<T> clazz, int start, int limit) {
		TypedQuery<T> countQuery = getEntityManager().createQuery(sql, clazz);
		TypedQuery<T> listQuery = getEntityManager().createQuery(sql, clazz);
		listQuery.setFirstResult(start);
		listQuery.setMaxResults(limit);
		return new PageBean<T>(countQuery.getResultList().size(), listQuery.getResultList());
	}

}
