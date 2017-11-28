package com.chenwenjie.blog.common.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 分页响应数据
 * 
 * @author chenwenjie
 * @since 2017-10-09
 * @param <T>
 */
public class PageBean<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private long count;

	private List<T> list;

	public PageBean() {
	}

	public PageBean(long count, List<T> list) {
		this.count = count;
		this.list = list;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
