package com.so.publish;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * 
 * @author Mohan K - AL2428
 *
 */
public interface UserRepository  extends MongoRepository<User, String> {
	  User findBy_id(ObjectId _id);
	}
