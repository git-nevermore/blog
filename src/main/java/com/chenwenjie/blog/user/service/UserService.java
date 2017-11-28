package com.chenwenjie.blog.user.service;

import java.util.List;

import com.chenwenjie.blog.user.bean.UserCreateParam;
import com.chenwenjie.blog.user.bean.UserQueryParam;
import com.chenwenjie.blog.user.bean.UserUpdateParam;
import com.chenwenjie.blog.user.entity.User;

/**
 * 用户注册操作管理接口
 * 
 * @author chenwenjie
 * @since 2017-10-09
 */
public interface UserService {

	/**
	 * 根据用户名获取用户
	 * @param username
	 * @return
	 */
	User getByName(String username);
	
	/**
	 * 获取全部用户信息
	 * @return
	 */

	List<User> listAll();

	/**
	 * 根据查询条件获取指定用户
	 * @param userQueryParam
	 * @return
	 */
	List<User> listUsers(UserQueryParam userQueryParam);

	/**
	 * 创建用户
	 * @param userCreateParam
	 * @return
	 */
	User createUser(UserCreateParam userCreateParam);

	/**
	 * 修改用户
	 * @param user
	 * @return
	 */

	User modifyUser(UserUpdateParam userUpdateParam);

	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	void deleteUser(Integer id);

	/**
	 * 用户认证
	 * @param username 
	 * @param password 
	 * @return
	 */
	User authenticate(String username, String password);

}
