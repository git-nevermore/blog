package com.chenwenjie.blog.user.bean;

/**
 * 用户查询条件
 * 
 * @author chenwenjie
 * @since 2017-10-09
 */
public class UserQueryParam {

	private String username;
	private String nickname;
	private String type;

	public UserQueryParam() {
		super();
	}

	public UserQueryParam(String username, String nickname, String type) {
		super();
		this.username = username;
		this.nickname = nickname;
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
