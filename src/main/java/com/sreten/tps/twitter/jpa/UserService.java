package com.sreten.tps.twitter.jpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreten.tps.twitter.crud.UserRepository;
import com.sreten.tps.twitter.model.User;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList();
		userRepository.findAll()
		.forEach(users::add);
		
		return users;
	}
	
	public Optional<User> getUser(Long id) {
		//return users.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return userRepository.findById(id);
	}

	public void addUser(User user) {
		userRepository.save(user);
		
	}

	public void updateUser(Long id, User user) {
		userRepository.save(user);
	}

	public void deleteUser(Long id) {
//		users.removeIf(t -> t.getId().equals(id));
		userRepository.deleteById(id);
		
	}
}
