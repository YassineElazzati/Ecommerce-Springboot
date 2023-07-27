package com.roadtocda.ecommerce.cda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.ecommerce.cda.model.Status;
import com.roadtocda.ecommerce.cda.repository.StatusRepository;

@Service
public class StatusService {

	@Autowired
	private StatusRepository statusrepository;
	
	public Optional<Status>getStatus(final long id ){
		return statusrepository.findById(id);
	}	
}
