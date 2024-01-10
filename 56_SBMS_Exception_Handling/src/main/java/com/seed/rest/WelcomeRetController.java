package com.seed.rest;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class WelcomeRetController {
	
	
	org.slf4j.Logger  logger=LoggerFactory.getLogger(WelcomeRetController.class);
	
	
	
	@GetMapping("/welcome")
	public String Welcome() {
		
		try {
			
			int i=10/1;
		} catch (Exception e) {
			logger.error("Exception occured .."+ e,e);
			throw new ArithmeticException(e.getMessage());
		}
		
		return "Welcome saurav... " ;
		
	}

}
