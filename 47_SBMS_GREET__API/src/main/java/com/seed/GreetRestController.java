package com.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.client.impl.Environment;

@RestController

public class GreetRestController {
	
	@Autowired
	private WelcomeApiClient welcomeClient;
	
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		
//		String port =env.getproperty("server.port.......");
		String msg="Good Morning...";
//		String greetMsg="Good Morning(port :: "+ port + "),";
		
		String welcomemsg=welcomeClient.invokeWelcomeApi();
		return welcomemsg+msg;
	}

}
