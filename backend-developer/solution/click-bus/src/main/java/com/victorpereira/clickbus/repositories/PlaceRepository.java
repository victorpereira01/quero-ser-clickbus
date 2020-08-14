package com.victorpereira.clickbus.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.victorpereira.clickbus.models.Place;

public interface PlaceRepository extends MongoRepository<Place, String>{

}
