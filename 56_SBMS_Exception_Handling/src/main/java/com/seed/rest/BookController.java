package com.seed.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.seed.exception.NoDataFoundException;


@RestController
public class BookController {
	
	@GetMapping("/price/{isbn}")
	public String getPrice(@PathVariable String isbn) {
		String msg=" ";
		
		if(isbn.equals("ISBN001")) {
			msg="BOOK PRICE IS :400 $";
		}else {
			throw new NoDataFoundException("INVALID ISBN");
		}
		
		return msg;
	}

}
