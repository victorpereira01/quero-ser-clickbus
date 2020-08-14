package com.victorpereira.clickbus.services.utils;

import java.util.Date;

import com.victorpereira.clickbus.models.Place;

public class Utils {

	public static Place updateData(Place currentData, Place newData) {
		currentData.setCity(newData.getCity());
		currentData.setName(newData.getName());
		currentData.setState(newData.getState());
		currentData.setUpdatedAt(new Date(System.currentTimeMillis()));
		return currentData;
	}
}
