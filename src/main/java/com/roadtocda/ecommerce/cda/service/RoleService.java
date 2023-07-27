package com.roadtocda.ecommerce.cda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.ecommerce.cda.model.Role;
import com.roadtocda.ecommerce.cda.repository.RoleRepository;


@Service
public class RoleService {

		@Autowired
		private RoleRepository roleRepository;
		
		public Optional<Role>getRole(final long id){
			return roleRepository.findById(id);
		}
		
		public Iterable<Role> getRole(){
			return roleRepository.findAll();
			
		}
	
}
