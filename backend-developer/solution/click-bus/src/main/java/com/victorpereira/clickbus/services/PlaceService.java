package com.victorpereira.clickbus.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorpereira.clickbus.models.Place;
import com.victorpereira.clickbus.repositories.PlaceRepository;

@Service
public class PlaceService {

	@Autowired
	private PlaceRepository repo;

	public List<Place> findAll() {
		return repo.findAll();
	}

	public Place findById(String id) {
		Optional<Place> place = repo.findById(id);
		return place.orElseThrow();
	}

	public Place insert(Place place) {
		return repo.insert(place);
	}
}
