package com.chenwenjie.blog.article.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 博客文章内容实体定义
 * 
 * @author chenwenjie
 * @since 2017-12-05
 */
@Entity
@Table(name = "article")
public class Article {

	private Long id;
	
	private String title;

	/**
	 * 副标题
	 */
	private String postTitle;
	
	/**
	 * 描述信息
	 */
	private String description;
	
	/**
	 * 详细内容
	 */
	private String content;

	/**
	 * 发表日期
	 */
	private Date date;
	
	/**
	 * 文章作者
	 */
	private String author;
	
	public Article(Long id, String title, String postTitle, String description, String content, Date date,
			String author) {
		super();
		this.id = id;
		this.title = title;
		this.postTitle = postTitle;
		this.description = description;
		this.content = content;
		this.date = date;
		this.author = author;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "title", nullable = false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name = "postTitle", nullable = true)
	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	@Column(name = "description", nullable = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "content", nullable = false)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "date", nullable = false)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "author", nullable = false)
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
