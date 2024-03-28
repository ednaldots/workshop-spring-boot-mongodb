package com.nelioalves.worshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.worshopmongo.domain.User;
import com.nelioalves.worshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	public List<User> findAll() {
		return repo.findAll();
		
	}

}
