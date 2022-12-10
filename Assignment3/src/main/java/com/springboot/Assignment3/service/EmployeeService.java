package com.springboot.Assignment3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Assignment3.Repository.EmployeeRepository;
import com.springboot.Assignment3.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	 EmployeeRepository repository ;

	public Iterable<Employee> findAll() {
		return repository.findAll();
	}

	public Employee save(Employee e) {
		return repository.save(e);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

}

