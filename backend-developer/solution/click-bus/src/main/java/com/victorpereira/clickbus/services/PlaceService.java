package com.victorpereira.clickbus.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorpereira.clickbus.models.Place;
import com.victorpereira.clickbus.repositories.PlaceRepository;
import com.victorpereira.clickbus.services.utils.Utils;

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
	
	public Place findByName(String name) {
		String uncodedName = Utils.uncode(name);
		return repo.findByName(uncodedName);
	}

	public Place insert(Place place) {
		return repo.insert(place);
	}
	
	public Place update(Place place, String id) {
		Place newPlace = findById(id);
		place = Utils.updateData(newPlace, place);
		return repo.save(newPlace);
	}
}
