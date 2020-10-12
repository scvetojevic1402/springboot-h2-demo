package com.sreten.twitterparsingsystem.twitter.crud;

import org.springframework.data.repository.CrudRepository;

import com.sreten.twitterparsingsystem.twitter.model.Place;

public interface PlaceRepository extends CrudRepository<Place, String>{

}
