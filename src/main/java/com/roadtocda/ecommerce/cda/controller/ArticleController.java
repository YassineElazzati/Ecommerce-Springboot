package com.roadtocda.ecommerce.cda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roadtocda.ecommerce.cda.model.Article;
import com.roadtocda.ecommerce.cda.service.ArticleService;

@RestController
public class ArticleController {
	
	@Autowired
	private ArticleService ArticleService;
	
	@GetMapping("/Article")
	public Iterable<Article> getArticle(){
		return ArticleService.getArticle();
	}
}
