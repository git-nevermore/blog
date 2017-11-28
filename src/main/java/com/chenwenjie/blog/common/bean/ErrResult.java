package com.chenwenjie.blog.common.bean;

/**
 * 异常信息返回实体
 * @author chenwenjie
 * @since 2017-10-14
 */
public class ErrResult {
	
	private Integer code ;
	
	private String message;

	public ErrResult(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public ErrResult() {
		super();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
