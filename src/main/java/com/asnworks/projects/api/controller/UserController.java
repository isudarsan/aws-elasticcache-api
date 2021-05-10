/**
 * 
 */
package com.asnworks.projects.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asnworks.projects.api.model.User;
import com.asnworks.projects.api.service.UserService;

/**
 * @author isudarsan
 *
 */
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService redisService;

	@GetMapping("/{id}")
	public ResponseEntity<Object> getById(@PathVariable("id") int id) {
		return ResponseEntity.ok(redisService.getById(id));
	}

	@PostMapping("/create")
	public ResponseEntity<Object> create(@RequestBody User user) {
		redisService.save(user);
		return ResponseEntity.ok("User Created");
	}

	@GetMapping("/all")
	public ResponseEntity<Object> getAll() {
		return ResponseEntity.ok(redisService.getAll());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") int id) {
		redisService.delete(id);
		return ResponseEntity.ok("Record Deleted");
	}

	@PutMapping("/update")
	public ResponseEntity<Object> update(@RequestBody User user) {
		redisService.update(user);
		return ResponseEntity.ok("User Updated");
	}

}
