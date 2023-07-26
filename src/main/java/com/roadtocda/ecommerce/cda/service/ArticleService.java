package com.roadtocda.ecommerce.cda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.ecommerce.cda.model.Article;
import com.roadtocda.ecommerce.cda.repository.ArticleRepository;

@Service
public class ArticleService {


		@Autowired
		private ArticleRepository artRepository;
		
		public Optional<Article>getArticle(final long id ){
			return artRepository.findById(id);
		}
		public Iterable<Article> getArticles(){
			return artRepository.findAll();
		}
		
		public void deleteArticle(final Long id) {
			artRepository.deleteById(id);
		}
		public Article saveArticle(Article Article) {
			Article savedArticle = artRepository.save(Article);
			return savedArticle;
		}

	public Iterable<Article> getArticle() {
		// TODO Auto-generated method stub
		return null;
	}
}

