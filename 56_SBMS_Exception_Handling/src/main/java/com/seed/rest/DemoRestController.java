package com.seed.rest;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seed.exception.ExceptionInfo;

@RestController
public class DemoRestController {
	
	private org.slf4j.Logger logger= LoggerFactory.getLogger(DemoRestController.class);
	
	@GetMapping("/demo")
	public String doAction() {
		String msg= "Action in progress...!";
		
		try {
			
			int i=10/0;
			
		} catch (Exception e) {
   
			logger.error("Eception occured :: "+e.getMessage());
			
			throw new ArithmeticException(e.getMessage());
		
		}
	
				return msg;
	}
	
	
	@ExceptionHandler(value=ArithmeticException.class)                  //local and globle handling 
	                                                                                //this globle beacusee it shown in this class only
	public ResponseEntity<ExceptionInfo> handelAE(ArithmeticException ae){
		ExceptionInfo exception=new ExceptionInfo();
		exception.setMsg(ae.getMessage());
		exception.setCode("AIT0004");
		return new ResponseEntity<>(exception,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
