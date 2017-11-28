package com.chenwenjie.blog.common.bean;

import java.io.Serializable;

/**
 * 服务端响应消息体封装
 * @author chenwenjie
 * @since 2017-10-14
 */
public class Result implements Serializable{

	private static final long serialVersionUID = -9154454745920658774L;
	
	private String message;
	
	public Result() {
		super();
	}

	public Result(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Result [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
