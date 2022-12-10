 package com.springboot.Assignment3.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.Assignment3.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    
}
