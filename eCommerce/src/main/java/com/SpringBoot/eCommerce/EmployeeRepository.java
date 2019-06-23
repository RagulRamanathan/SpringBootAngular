package com.SpringBoot.eCommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
	

}
