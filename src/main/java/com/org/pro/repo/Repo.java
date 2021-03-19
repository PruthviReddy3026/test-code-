package com.org.pro.repo;

import com.org.pro.model.EmployeeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends MongoRepository<EmployeeModel,Integer> {
}
