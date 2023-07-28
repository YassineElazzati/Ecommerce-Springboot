package com.roadtocda.ecommerce.cda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roadtocda.ecommerce.cda.model.Role;

@Repository
public interface RoleRepository extends CrudRepository< Role, Long>{
	

}
