package com.chenwenjie.blog.user.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenwenjie.blog.common.bean.Result;
import com.chenwenjie.blog.user.bean.UserCreateParam;
import com.chenwenjie.blog.user.bean.UserLoginParam;
import com.chenwenjie.blog.user.entity.User;
import com.chenwenjie.blog.user.service.UserService;

/**
 * 用户操作管理控制层
 * 
 * @author chenwenjie
 * @since 2017-10-09
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Resource
	private UserService userService; 
	
	/**
	 * 用户登录
	 * <P>简单的数据明文与数据库记录比较	 #TODO: 数据加密存储
	 * <p>缺少权限控制					 #TODO: OAuth2.0/Token  	
	 *  
	 * @param UserLoginParam
	 * @return 
	 */
	@ResponseBody
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public Result login(@Valid UserLoginParam userLoginParam, HttpServletRequest request){
		User user = userService.authenticate(userLoginParam.getUsername(), userLoginParam.getPassword());
		Assert.notNull(user, "用户名或密码错误");
		HttpSession session = request.getSession();
		session.setAttribute("username", user.getUsername());
		return new Result("登录成功");
	}
	
	/**
	 * 注册用户
	 * @param userCreateParam
	 * @return
	 */
	@ResponseBody			
	@RequestMapping(value = "/registry" , method = RequestMethod.POST )
	public Result registry(@ModelAttribute UserCreateParam userCreateParam){
		Assert.notNull(userCreateParam, "用户创建参数为空");
		userService.createUser(userCreateParam);
		return new Result("注册成功");
	}
	
	/**
	 * 获取用户列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/list" , method = RequestMethod.GET)
	public List<User> getUserList(){
		return userService.listAll();
	}
}
