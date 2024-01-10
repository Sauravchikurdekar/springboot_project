package com.seed.service;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	
	public String getmsg() {
		String msg="Welcome";
		
		
		return msg;
		
		
		
	}
	
	public  Integer pattern() {
		
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==0||j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		return n ;
	}
	
	

}
