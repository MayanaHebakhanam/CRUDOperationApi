package com.springboot.Assignment3.controller;

import javax.validation.Valid;
import javax.validation.ValidationException;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Assignment3.Repository.EmployeeRepository;
import com.springboot.Assignment3.model.Employee;
import com.springboot.Assignment3.service.EmployeeService;


@RestController
@Validated
@RequestMapping("/main")
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	@GetMapping("/employee")
	Iterable<Employee> read() {
		return es.findAll();
	}

	@PutMapping("/employee")
	Employee update(@RequestBody Employee e) {
		return es.save(e);
	}

	@ResponseBody
	@PostMapping("/employee")
	Employee create(@Valid @RequestBody Employee e) {
		return es.save(e);
	}

	@DeleteMapping("/employee/{id}")
	void delete(@PathVariable @Min(1) @Max(45) Integer id) {
		es.deleteById(id);
	}

}
