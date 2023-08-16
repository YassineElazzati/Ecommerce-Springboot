package com.roadtocda.ecommerce.cda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.roadtocda.ecommerce.cda.service.ArticleService;
import com.roadtocda.ecommerce.cda.service.TypearticleService;

@Controller
public class DetailArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private TypearticleService typearticleService;
	
	
}
