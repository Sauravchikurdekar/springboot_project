package com.seed.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seed.service.WelcomeService;

@RestController
public class WelcomeRestController {
	@Autowired
	private WelcomeService service;
	
	
	@GetMapping("/welcome")
	public String getdata() {
		String msg=service.getmsg();
		return msg;
	}
	
	@GetMapping("/pat")
	public Integer pattern() {
		Integer patt=service.pattern();
		return patt;
	}

}
