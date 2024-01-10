package com.seed.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service

public class WelcomeService {

	String apiUrl = "http://localhost:8080";

	public void invokeWelcomeApi() {
		String apiUrl = "http://localhost:8080";

		RestTemplate rt = new RestTemplate();
                                                                                  //showing the secure data from other server
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("admin", "Saurav");

		HttpEntity<String> reqEntity = new HttpEntity<>(headers);
		ResponseEntity<String> responseEntity = rt.exchange(apiUrl, HttpMethod.GET, reqEntity, String.class);

		String body = responseEntity.getBody();

		System.out.println(body);
	}

	public void invokeWelcome() {

		WebClient webClient = WebClient.create();                                //logic for accessing secure data from client side

		String block = webClient.get()
		                       .uri(apiUrl)
		                       .headers(headers-> headers.setBasicAuth("admin", "Saurav"))   //for getting that secure code .headers (->headers.setBasicAuth(uername,pass))
		                       .retrieve()
		                       .bodyToMono(String.class)
		                       .block();
	}

}
