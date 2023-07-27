package com.roadtocda.ecommerce.cda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.roadtocda.ecommerce.cda.model.Taille;

@Repository
public interface TailleRepository extends CrudRepository<Taille, Long>{

}
