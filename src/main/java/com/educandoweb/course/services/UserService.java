package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User2;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User2> findAll() {
		return repository.findAll();
	}
	
	public User2 findById(Long id) {
		Optional<User2> obj = repository.findById(id);
		return obj.get();
	}
}
