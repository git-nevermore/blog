package com.chenwenjie.blog.article.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chenwenjie.blog.article.entity.Article;
import com.chenwenjie.blog.article.service.ArticleService;

/**
 * 博客文章管理控制层
 * 
 * @author chenwenjie
 * @since 2017-12-05
 */
@Controller
@RequestMapping(value = "/article")
public class ArticleController {
	
	@Resource
	private ArticleService articleService; 
	
	@RequestMapping(method = RequestMethod.GET)
	public String listAll(Model model) {
		Article article = articleService.getOneArticle();
		String content = article.getContent();
		// 替换回车
		article.setContent(content.replace("\n", "<br>"));
		model.addAttribute("article",article);
		return "article";
	}
	
}
