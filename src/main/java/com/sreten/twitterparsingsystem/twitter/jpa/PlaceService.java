package com.sreten.twitterparsingsystem.twitter.jpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreten.twitterparsingsystem.twitter.crud.PlaceRepository;
import com.sreten.twitterparsingsystem.twitter.model.Place;

@Service
public class PlaceService {
	
	
	@Autowired
	private PlaceRepository placeRepository;
	
	public List<Place> getAllPlaces(){
		List<Place> places = new ArrayList();
		placeRepository.findAll()
		.forEach(places::add);
		
		return places;
	}
	
	public Optional<Place> getPlace(String id) {
		return placeRepository.findById(id);
	}

	public void addPlace(Place place) {
		placeRepository.save(place);
	}

	public void updatePlace(String id, Place place) {
		placeRepository.save(place);
	}

	public void deletePlace(String id) {
		placeRepository.deleteById(id);
		
	}
}
