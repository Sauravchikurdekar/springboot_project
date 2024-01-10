package com.seed.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice                                          //if you write exceptionhandleer  method  seprately (in different class)  then it i called
                                                                         // globle exception hanlding othewise local exception handling

public class AppExceptionHandler {

	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handelAE(ArithmeticException ae) {
		ExceptionInfo exception = new ExceptionInfo();

		exception.setMsg(ae.getMessage());
		exception.setCode("AIT0004");

		return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value=NoDataFoundException.class)
	public ResponseEntity<ExceptionInfo> handelAE(NoDataFoundException ndfe){
		ExceptionInfo exception=new ExceptionInfo();
		
		exception.setMsg(ndfe.getMessage());
		exception.setCode("AIT005");
		return new ResponseEntity<>(exception , HttpStatus.BAD_REQUEST);
	}
}
