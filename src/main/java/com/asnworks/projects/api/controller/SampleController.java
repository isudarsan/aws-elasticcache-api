/**
 * 
 */
package com.asnworks.projects.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author isudarsan
 *
 */
@RestController
@RequestMapping("/api")
public class SampleController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String sayHello() {
		return "<h1>Hello, world!</h1>";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/live")
	public ResponseEntity<Object> live() {
		return ResponseEntity.ok(new java.util.Date());
	}

}
