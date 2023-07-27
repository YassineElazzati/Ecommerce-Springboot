package com.roadtocda.ecommerce.cda.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.roadtocda.ecommerce.cda.model.Taille;
import com.roadtocda.ecommerce.cda.repository.TailleRepository;

@Service
public class TailleService {

	@Autowired
	private TailleRepository tailleRepository;
	
	public Optional<Taille>getTaille(final long id){
		return tailleRepository.findById(id);
	}
	public Iterable<Taille>getTailles(){
		return tailleRepository.findAll();
	}	
}
