package com.seed.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seed.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {
	
	

}
