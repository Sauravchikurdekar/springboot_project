package com.seed.controller;

import org.apache.catalina.User;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {

//	private RedisTemplate<String, String> redisTemplate;
	HashOperations<String, Object, Object> hashops;

	public Restcontroller(RedisTemplate<String, String> redisTemplate) {
//		this.redisTemplate = redisTemplate;
		hashops = redisTemplate.opsForHash();
	}

	
	@PostMapping("/store")
	public String storeData(@RequestBody User user) {
		hashops.put("person", user.getUsername(), user);
		return "Sucesss....";
	}

	@GetMapping("/data/{uid}")
	public String getData(@PathVariable Integer uid) {
		String value = (String) hashops.get("PERSON", "SBMS");
		return "value";
	}

}
