package com.chenwenjie.blog.article.service;

import com.chenwenjie.blog.article.entity.Article;

/**
 * 博客文章操作接口
 * 
 * @author chenwenjie
 * @since 2017-12-05
 */
public interface ArticleService {

	/**
	 * 获取单篇文章
	 * @return
	 */
	Article getOneArticle();
	
}
