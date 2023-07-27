package com.roadtocda.ecommerce.cda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.ecommerce.cda.model.Utilisateur;
import com.roadtocda.ecommerce.cda.repository.UtilisateurRepository;


@Service
public class UtilisateurService {
	
	@Autowired
	private UtilisateurRepository utiRepository ;
	
	
	public Optional<Utilisateur>getUtilisateur(final long id){
		return utiRepository.findById(id);
	}
	
	
	public Iterable<Utilisateur>getUtilisateurs(){
		return utiRepository.findAll();
	}
	
	public void deleteUtilisateur(final Long id) {
			utiRepository.deleteById(id);
	}

		public Utilisateur saveUtilisateur (Utilisateur Utilisateur) {
			Utilisateur savedUtilisateur = utiRepository.save(Utilisateur);
			return savedUtilisateur;
			
		}

}
