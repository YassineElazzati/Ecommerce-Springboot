package com.roadtocda.ecommerce.cda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.ecommerce.cda.model.Article;
import com.roadtocda.ecommerce.cda.model.Typearticle;
import com.roadtocda.ecommerce.cda.repository.TypearticleRepository;

@Service
public class TypearticleService {
	
	@Autowired
	private TypearticleRepository typearticleRepository;
	
	public Optional<Typearticle>getTypearticle(final long id ){
		return typearticleRepository.findById(id);
	}
	public Iterable<Typearticle> getTypearticles(){
		return typearticleRepository.findAll();
	}  
	
	

}
