package com.victorpereira.clickbus.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
