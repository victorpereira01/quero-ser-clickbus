package com.victorpereira.clickbus.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.victorpereira.clickbus.models.Place;
import com.victorpereira.clickbus.repositories.PlaceRepository;

@Configuration
public class DatabaseInit implements CommandLineRunner { 
	
	@Autowired
	private PlaceRepository repo;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		repo.deleteAll();
		
		Place p1 = new Place(null, "Torre do Castelo", "Campinas", "São Paulo", new Date(System.currentTimeMillis()), null);
		Place p2 = new Place(null, "Torre do Castelo", "Campinas", "São Paulo", new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()));
	
		repo.saveAll(Arrays.asList(p1,p2));
	}
}
