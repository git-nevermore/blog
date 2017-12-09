package com.chenwenjie.blog.article.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chenwenjie.blog.article.dao.ArticleDao;
import com.chenwenjie.blog.article.entity.Article;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	private ArticleDao articleDao;
	
	@Override
	public Article getOneArticle() {
		List<Article> articles = articleDao.findAll();
		if (!articles.isEmpty() && articles.size() >= 1) {
			return articles.get(0);
		}
		return null;
	}

}
