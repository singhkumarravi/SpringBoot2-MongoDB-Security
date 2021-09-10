package com.olive.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.olive.model.Employee;


public interface ProductRepo extends MongoRepository<Employee, Integer> {

}
