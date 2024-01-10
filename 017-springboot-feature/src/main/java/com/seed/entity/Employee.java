package com.seed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity

@Data
public class Employee {

	@Id
	@GeneratedValue

	private long id;
	
	
	@Column(name = "firt_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;

	private double salary;

}