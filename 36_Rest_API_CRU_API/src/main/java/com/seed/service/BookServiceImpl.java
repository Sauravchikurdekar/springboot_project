package com.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.entity.Book;
import com.seed.repo.BookRepository;

@Service
public abstract class BookServiceImpl implements BookService {
	private BookRepository repository;

	
	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;

	}

	@Override
	public String upsertBook(Book book) {

		Book savedBook = repository.save(book);

		if (book.getBookId() == null)
			return "Record inserted....";
		else
			return "Record Updated...";
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> findAll = repository.findAll();

		return findAll;
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);

		return "Record deleted...";
	}

}
