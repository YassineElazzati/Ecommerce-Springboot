package com.roadtocda.ecommerce.cda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roadtocda.ecommerce.cda.model.Couleur;

@Repository
public interface CouleurRepository extends CrudRepository<Couleur, Long>{

}
