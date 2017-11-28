package com.chenwenjie.blog.user.bean;

/**
 * 用户登录参数
 * @author chenwenjie
 * @since 2017-10-09
 */
public class UserLoginParam {

	private String username;
	private String password;
	
	public UserLoginParam() {
		super();
	}

	public UserLoginParam(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
