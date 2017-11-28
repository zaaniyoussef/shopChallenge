package com.test.shopChallenge.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.shopChallenge.Domain.Shops;
import com.test.shopChallenge.Domain.ShopsRepository;

@Service
public class ShopsService {
	
	@Autowired
	private ShopsRepository sh;
		
	public List<Shops> getAllByUser(String id){
		return sh.findAllByCratedById(id);
	}
	
	public List<Shops> getAll(){
		return sh.findAll();
	}
	
	public List<Shops> getAllByStatus(String status){
		return sh.findAllByStatus(status);
	}
	
	public void Update(Shops e) {
		sh.save(e);
	}
}
