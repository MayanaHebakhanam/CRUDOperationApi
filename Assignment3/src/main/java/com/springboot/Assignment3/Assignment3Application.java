package com.springboot.Assignment3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.Assignment3.Repository.EmployeeRepository;
import com.springboot.Assignment3.controller.EmployeeController;

@SpringBootApplication
public class Assignment3Application {
	private static final Logger logger1=
		       LoggerFactory.getLogger(EmployeeController.class);
	private static final Logger logger2=
		       LoggerFactory.getLogger(EmployeeRepository.class);
			  		  

	public static void main(String[] args) {
		logger1.info("this is a controller layer info");
		logger2.info("this is a service layer info");
		SpringApplication.run(Assignment3Application.class, args);
	}

}
