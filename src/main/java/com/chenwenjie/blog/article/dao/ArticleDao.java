package com.chenwenjie.blog.article.dao;

import org.springframework.stereotype.Repository;

import com.chenwenjie.blog.article.entity.Article;
import com.chenwenjie.blog.common.dao.BaseDao;

@Repository
public interface ArticleDao extends BaseDao<Article,Long> {
}
