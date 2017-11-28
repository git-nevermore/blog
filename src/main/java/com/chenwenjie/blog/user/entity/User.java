package com.chenwenjie.blog.user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.chenwenjie.blog.user.bean.UserCreateParam;

@Entity
@Table(name = "user")
public class User {

	/**
	 * 用户ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	/**
	 * 用户账号名
	 */
	@Column(name = "username", unique = true, nullable = false)
	private String username;

	/**
	 * 用户昵称
	 */
	@Column(name = "nickname", nullable = false)
	private String nickname;

	/**
	 * 用户密码
	 */
	@Column(name = "password")
	private String password;

	/**
	 * 用户类型
	 * <p>
	 * 0 为管理员用户, 1 为普通用户
	 */
	@Column(name = "type")
	private String type;

	/**
	 * 注册时间
	 */
	@Column(name = "registry_time")
	private Date registryTime;

	/**
	 * 最后一次登录时间
	 */
	@Column(name = "last_login_time")
	private Date lastLoginTime;

	public User() {
		super();
	}

	public User(Integer id, String username, String nickname, String password, String type, Date lastLoginTime,
			Date registryTime) {
		super();
		this.id = id;
		this.username = username;
		this.nickname = nickname;
		this.password = password;
		this.type = type;
		this.lastLoginTime = lastLoginTime;
		this.registryTime = registryTime;
	}

	public User(UserCreateParam userCreateParam) {
		this.username = userCreateParam.getUsername();
		this.nickname = userCreateParam.getNickname();
		this.password = userCreateParam.getPassword();
		this.type = userCreateParam.getType();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getRegistryTime() {
		return registryTime;
	}

	public void setRegistryTime(Date registryTime) {
		this.registryTime = registryTime;
	}

}
