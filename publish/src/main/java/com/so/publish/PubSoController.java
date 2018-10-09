package com.so.publish;


import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/getUser/{id}")
	public User getUserById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}
	@PutMapping("/updateUser/{id}")
	public void updateUserById(@PathVariable("id") ObjectId id,@Valid @RequestBody User user) {
		user.set_id(id);
		repository.save(user);
	}
		 
	 @PostMapping("/createuser")
	 public User createUser(@Valid @RequestBody User user) {
		user.set_id(ObjectId.get());
		repository.save(user);
		return user;
	 }
	  
	  @DeleteMapping("/deleteUser/{id}")
	  public void deleteUserById(@PathVariable("id") ObjectId id) {
		  repository.delete(repository.findBy_id(id));
	  }
	  
}
