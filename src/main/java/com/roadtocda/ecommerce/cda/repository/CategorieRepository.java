package com.roadtocda.ecommerce.cda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roadtocda.ecommerce.cda.model.Categorie;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long> {
	
}
