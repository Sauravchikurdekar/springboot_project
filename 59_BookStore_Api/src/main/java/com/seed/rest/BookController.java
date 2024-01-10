package com.seed.rest;

//HttpClient is used to send the request in backend from frondend and strored in book:Book[]=[] array format for getdata in frondend 
//subscribe method is used get response from backend in frontend

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seed.entity.Book;
import com.seed.service.BookService;

@RestController
@CrossOrigin

public class BookController {
	@Autowired
	private BookService service;
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		
		String msg = service.upsertBook(book);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/books")
	public 	ResponseEntity<List<Book>> getAllBook(){
		List<Book> allBooks = service.getAllBooks();
		
		return new ResponseEntity<>(allBooks,HttpStatus.OK);	
		
	}
	
	/*
	 * @PutMapping("/book") public ResponseEntity<String> updateBook(@RequestBody
	 * Book book){
	 * 
	 * String msg = service.upsertBook(book); return new
	 * ResponseEntity<>(msg,HttpStatus.OK); }
	 * 
	 * 
	 * @DeleteMapping("/book{bookId}") public ResponseEntity<String>
	 * deleBook(@PathVariable Integer book){ String msg = service.deleteBook(book);
	 * return new ResponseEntity<>(msg,HttpStatus.OK);
	 * 
	 * }
	 */
	
}
