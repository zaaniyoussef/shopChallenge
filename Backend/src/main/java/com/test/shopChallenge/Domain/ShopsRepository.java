package com.test.shopChallenge.Domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopsRepository extends MongoRepository<Shops, String> {
	public List<Shops> findAllByCratedById(String id);
	public List<Shops> findAllByStatus(String status);

}
