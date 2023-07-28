package com.roadtocda.ecommerce.cda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.ecommerce.cda.model.Couleur;
import com.roadtocda.ecommerce.cda.repository.CouleurRepository;

@Service
public class CouleurService {
	
	@Autowired
	private CouleurRepository couleurRepository;
	
	public Optional<Couleur> getCouleur(final long id){
		return couleurRepository.findById(id);
	}
	public Iterable<Couleur>getCouleurs(){
		return couleurRepository.findAll();
	}
}
