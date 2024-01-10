package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
		
		
		@GetMapping("k")
		public String display() {
			return "Hello";
		}
		
		@GetMapping("demo")
		public String display1() {
			return "Hello welcome to RestAPI";	
			}

}
