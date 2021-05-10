/**
 * 
 */
package com.asnworks.projects.api.repo;

import org.springframework.data.repository.CrudRepository;

import com.asnworks.projects.api.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
