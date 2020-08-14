package com.victorpereira.clickbus.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.victorpereira.clickbus.models.Place;
import com.victorpereira.clickbus.services.PlaceService;

@RestController
@RequestMapping(value="/places")
public class PlaceResource {
	
	@Autowired
	private PlaceService service;
	
	@GetMapping
	public List<Place> findAll() {
		return service.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Place findById(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping 
	@ResponseStatus(HttpStatus.CREATED)
	public Place insert(@RequestBody Place place) {
		return service.insert(place);
	}
	
	@PutMapping(value="/{id}")
	public Place update(@RequestBody Place place, @PathVariable String id) {
		return service.update(place, id);
	}
}
