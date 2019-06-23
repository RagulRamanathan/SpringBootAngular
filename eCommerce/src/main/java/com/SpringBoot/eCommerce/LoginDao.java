package com.SpringBoot.eCommerce;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginDao extends MongoRepository<User,Integer>{

	Optional<User> findByuname(String uname);
	
	

}
