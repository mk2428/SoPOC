package com.so.publish;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Mohan K - AL2428
 *
 */
@RestController
@RequestMapping("/so")
public class PubSoController {
	@Autowired
	  private UserRepository repository;
	/**
	 * 
	 * @return list of user from MangoDB thru Spring Rest Data
	 */
	@GetMapping("/getUsers")
	public List<User> getAllPets() {
	  return repository.findAll();
	}
	
}
