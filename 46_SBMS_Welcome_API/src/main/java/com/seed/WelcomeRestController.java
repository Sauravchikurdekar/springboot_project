package com.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.client.impl.Environment;

@RestController


public class WelcomeRestController {
	
//	@Autowired
	Environment env;
	

	@GetMapping("/Welcome")
	public String WelcomeMsg() {
		
		String port=env.toString();
		
	
		
		String greetmsg="Welcome Saurav...(" + port +")";
		
//		String greetmsg="Welcome saurav....";
				return greetmsg ;
	}
}
	