package com.chenwenjie.blog.user.bean;

/**
 * 用户修改参数
 * @author chenwenjie
 * @since 2017-10-09
 */
public class UserUpdateParam {

	private Integer id;
	private String nicknane;
	private String password;
	
	public UserUpdateParam(Integer id, String nicknane, String password) {
		super();
		this.id = id;
		this.nicknane = nicknane;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserUpdateParam() {
		super();
	}

	public String getNicknane() {
		return nicknane;
	}

	public void setNicknane(String nicknane) {
		this.nicknane = nicknane;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
