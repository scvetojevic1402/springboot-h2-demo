package com.sreten.tps.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.tps.twitter.model.Place;

public interface PlaceRepository extends CrudRepository<Place, String>{

}
