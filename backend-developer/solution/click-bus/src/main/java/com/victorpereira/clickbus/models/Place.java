package com.victorpereira.clickbus.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="places")
public class Place {

	@Id
	private String id;
	
	private String name;
	
	private String city;
	
	private String state;
	
	private Date createdAt;
	
	private Date updatedAt;
}
