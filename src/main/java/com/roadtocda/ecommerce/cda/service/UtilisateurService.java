package com.roadtocda.ecommerce.cda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.ecommerce.cda.model.Utilisateur;
import com.roadtocda.ecommerce.cda.repository.RoleRepository;
import com.roadtocda.ecommerce.cda.repository.UtilisateurRepository;

@Service
public class UtilisateurService {

		@Autowired
		private UtilisateurRepository utilisateurRepository;
		
		@Autowired
		private RoleRepository roleRepository;
		
		public Optional<Utilisateur>getUtilisateur(final long id){
			return utilisateurRepository.findById(id);
		}
		
		public Iterable<Utilisateur>getUtilisateurs(){
			return utilisateurRepository.findAll();
		}
		public void  deleteUtilisateur(final long id) {	
			utilisateurRepository.deleteById(id);	
		}
		public Utilisateur saveUtilisateur(Utilisateur Utilisateur ) {
				Utilisateur savedUtilisateur = utilisateurRepository.save(Utilisateur);
				return savedUtilisateur;
		}
	
}
