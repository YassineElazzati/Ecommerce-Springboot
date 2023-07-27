package com.roadtocda.ecommerce.cda.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.roadtocda.ecommerce.cda.model.Categorie;
import com.roadtocda.ecommerce.cda.repository.CategorieRepository;

@Service
public class CategorieService {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	public Optional<Categorie> getCategorie(final long id){
		return categorieRepository.findById(id);
	}
	public Iterable<Categorie>getCategories(){
		return categorieRepository.findAll();
	}
}
