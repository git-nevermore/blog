package com.chenwenjie.blog.common.exception;

/**
 * 基础异常定义
 * @author chenwenjie
 * @since 2017-10-09
 */
public class BaseException extends RuntimeException{

	private static final long serialVersionUID = -1583562224602976587L;

	public BaseException() {
		super();
	}

	public BaseException(String message) {
		super(message);
	}
}
