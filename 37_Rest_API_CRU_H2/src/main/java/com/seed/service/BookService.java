package com.seed.service;

import com.seed.entity.Book;

import antlr.collections.List;

public interface BookService {

	public String upsertBook(Book book);

	public java.util.List<Book> getAllBooks();

//	public String upddateBook(Book book);

	public String deleteBook(Book book);
	

	 public String deleteBook(Integer bookId);
}
