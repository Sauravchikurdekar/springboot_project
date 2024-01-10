package com.seed.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.entity.Employee;
import com.seed.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	
	public Employee addEmployee(Employee emp) {
		return empRepository.save(emp);
	}
	
	public Optional<Employee> getEmpDetails(Long id) {
		return empRepository.findById(id);
	}

}