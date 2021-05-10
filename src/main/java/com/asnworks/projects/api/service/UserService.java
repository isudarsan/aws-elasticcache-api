package com.asnworks.projects.api.service;

/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asnworks.projects.api.model.User;
import com.asnworks.projects.api.repo.UserRepository;

/**
 * @author isudarsan
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public void save(User user) {
		userRepository.save(user);
	}

	public User getById(Integer id) {
		return userRepository.findById(id).get();
	}

	public void delete(Integer id) {
		userRepository.deleteById(id);

	}

	public List<User> getAll() {
		List<User> list = new ArrayList<User>();

		userRepository.findAll().forEach(list::add);
		return list;
	}
	
	public void update(User user) {
		userRepository.save(user);
	}
}
