package com.seed.entity;


//By integrating Redis with Spring applications, developers can take advantage of the speed and flexibility offered by Redis, 
//and the Spring Data Redis module provides convenient abstractions and features to interact with Redis without dealing with low-level details.

//It's worth noting that using Redis or any caching solution should be done judiciously and carefully. Caching strategies need
//to be designed and managed well to ensure data consistency and integrity. Additionally, Redis is an external dependency, so proper error handling
//and fallback mechanisms should be in place to handle Redis server failures.





import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User implements Serializable {

	private Integer uid;
	private String name;
	private Integer age;
	public User(Integer uid, String name, Integer age) {
		super();
		this.uid = uid;
		this.name = name;
		this.age = age;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", age=" + age + "]";
	}
	
	

}

