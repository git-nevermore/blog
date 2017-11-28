package com.chenwenjie.blog.user.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.chenwenjie.blog.common.dao.BaseDao;
import com.chenwenjie.blog.user.bean.UserQueryParam;
import com.chenwenjie.blog.user.entity.User;

@Repository
public interface UserDao extends BaseDao<User, Integer>{

	/**
	 * 根据指定条件查询用户
	 * @param userQueryParam
	 * @return
	 */
	public List<User> queryUsers(UserQueryParam userQueryParam);

	/**
	 * 根据用户名获取用户
	 * @param username
	 * @return
	 */
	public User findByUsername(String username);
	
	/**
	 * 根据用户名和密码获取用户
	 * @param username
	 * @return
	 */
	public User findByUsernameAndPassword(String username,String password);
}
