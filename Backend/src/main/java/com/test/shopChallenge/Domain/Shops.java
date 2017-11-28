package com.test.shopChallenge.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Shops {
	
	@Id
	private String id;
	private String name;
	private String status;	
	
	public Shops(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}
	public Shops() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	

}