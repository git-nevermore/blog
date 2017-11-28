package com.chenwenjie.blog.user.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.chenwenjie.blog.common.exception.BaseException;
import com.chenwenjie.blog.user.bean.UserCreateParam;
import com.chenwenjie.blog.user.bean.UserQueryParam;
import com.chenwenjie.blog.user.bean.UserUpdateParam;
import com.chenwenjie.blog.user.dao.UserDao;
import com.chenwenjie.blog.user.entity.User;
import com.chenwenjie.blog.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	public User getByName(String username) {
		Assert.notNull(username,"用户名不能为空");
		return userDao.findByUsername(username);
	}
	
	@Override
	public List<User> listAll() {
		return userDao.findAll();
	}

	@Override
	public List<User> listUsers(UserQueryParam userQueryParam) {
		return userDao.queryUsers(userQueryParam);
	}

	@Override
	public User createUser(UserCreateParam userCreateParam) {
		User user = new User(userCreateParam);
		if(this.getByName(userCreateParam.getUsername()) != null ){
			throw new BaseException("用户名称已存在！");
		}
		user.setRegistryTime(new Date());
		return userDao.save(user);
	}

	@Override
	public User modifyUser(UserUpdateParam userUpdateParam) {
		User user = userDao.findOne(userUpdateParam.getId());
		if(user ==null){
			throw new BaseException("用户不存在");
		}
		user.setNickname(userUpdateParam.getNicknane());
		user.setPassword(userUpdateParam.getPassword());
		return userDao.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userDao.delete(id);
	}

	@Override
	public User authenticate(String username, String password) {
		if (username == null || password == null) {
			throw new BaseException("用户名和密码不能为空");
		}
		User user = userDao.findByUsernameAndPassword(username, password);
		// 记录用户登录行为
		logger.info("{} 用户登录{} ", username, user != null ? "成功" : "失败");

		// 更新最近登录时间
		if (user != null) {
			user.setLastLoginTime(new Date());
			userDao.save(user);
		}
		return user;
	}

}
