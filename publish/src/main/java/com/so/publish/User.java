package com.so.publish;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
/**
 * 
 * @author Mohan K - AL2428
 *
 */
public class User {
	 @Id
	  public ObjectId _id;
	  
	  public String name;
	  
	  
	 
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(ObjectId _id, String name) {
		super();
		this._id = _id;
		this.name = name;
	}
	// ObjectId needs to be converted to string
	  public String get_id() { return _id.toHexString(); }
	  public void set_id(ObjectId _id) { this._id = _id; }
	  
	  public String getName() { return name; }
	  public void setName(String name) { this.name = name; }
}
