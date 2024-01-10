package com.seed.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope

public class WelcomeRestcontroller {
	
	@Value("${msg :config server not working..}")
	private String msg;
	
	
	@GetMapping("/")
	private String getelcomeMsg() {
		return msg;
	}

}
