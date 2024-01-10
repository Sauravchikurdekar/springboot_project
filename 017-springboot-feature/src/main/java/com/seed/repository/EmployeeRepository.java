package com.seed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seed.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
