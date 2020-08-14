package com.victorpereira.clickbus.services;

import java.util.List;

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
}
