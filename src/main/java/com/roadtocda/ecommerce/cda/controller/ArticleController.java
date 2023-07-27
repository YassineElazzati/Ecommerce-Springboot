package com.roadtocda.ecommerce.cda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.roadtocda.ecommerce.cda.model.Article;
import com.roadtocda.ecommerce.cda.model.Taille;
import com.roadtocda.ecommerce.cda.model.Typearticle;
import com.roadtocda.ecommerce.cda.service.ArticleService;
import com.roadtocda.ecommerce.cda.service.TailleService;
import com.roadtocda.ecommerce.cda.service.TypearticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService ArticleService;
	@Autowired
	private TypearticleService typearticleService;
	@Autowired
	private TailleService tailleService;

	
	@GetMapping("/Articles")
	public Iterable<Article> getArticle(){
		return ArticleService.getArticles();
	}
	@GetMapping("/Article")
    public String Article(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("LesArticles", ArticleService.getArticles());
        return "index";
    }
	
	@GetMapping("/TypeArticles")
	public Iterable<Typearticle> getTypearticles(){
		return typearticleService.getTypearticles();
	}
//	@GetMapping("/TypeArticle")
//	public String TypeArticle(@RequestParam(name="name"))
//	
	
	@GetMapping("/Tailles")
	public Iterable<Taille> getTailles(){
		return tailleService.getTailles();
	}

	
}