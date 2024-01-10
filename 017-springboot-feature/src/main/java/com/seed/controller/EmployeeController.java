package com.seed.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seed.entity.Employee;
import com.seed.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/employee")
	//@RequestMapping(path="/employee", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee emp) {
		/*
		LOGGER.debug("add employee method called");
		LOGGER.info("add employee method called");
		LOGGER.warn("add employee method called");
		LOGGER.trace("add employee method called");
		LOGGER.error("add employee method called");
		*/
		LOGGER.info("Employee ="+emp);
		return empService.addEmployee(emp);
	}
	
	
	
	
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") Long empId) {
		Optional<Employee> emp = empService.getEmpDetails(empId);
		LOGGER.info("id= "+empId);
		if(emp.isPresent()) {
			return emp.get();
		}
		return null;
	}

}