package com.seed.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeRestController {

	@GetMapping("/")
	private String Welcome() {
		String msg = "Welcome saurav..."; // user name=user pass=will generated..

		return msg;
	}

}
