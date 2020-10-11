package com.sreten.h2springboot.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.h2springboot.twitter.model.Place;

public interface PlaceRepository extends CrudRepository<Place, String>{

}
