package com.sreten.twitterparsingsystem.twitter.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.geotools.geojson.geom.GeometryJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sreten.twitterparsingsystem.twitter.jpa.PlaceService;
import com.sreten.twitterparsingsystem.twitter.model.Place;

@RestController
public class PlaceController {
	
	
	@Autowired
	private PlaceService placeService;
	
	@RequestMapping("/places")
	public List<Place> getAllPlaces() {
		return placeService.getAllPlaces();
	}
	
	@RequestMapping("/places/{foo}")
	public Optional<Place> getPlace(@PathVariable("foo") String id) {
		return placeService.getPlace(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/places")
	public void addPlace(@RequestBody Place place) {
		placeService.addPlace(place);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/places/{id}")
	public void updatePlace(@RequestBody Place place, @PathVariable String id) {
		placeService.updatePlace(id, place);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/places/{id}")
	public void deletePlace(@PathVariable String id) {
		placeService.deletePlace(id);
	}
}
