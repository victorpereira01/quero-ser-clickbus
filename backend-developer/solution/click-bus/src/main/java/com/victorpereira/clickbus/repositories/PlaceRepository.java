package com.victorpereira.clickbus.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.victorpereira.clickbus.models.Place;

public interface PlaceRepository extends MongoRepository<Place, String>{

	@Transactional(readOnly = true)
	public Place findByName(String name);
}
