package com.javaprogram.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprogram.lms.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	public List<Book> findByBookName(String bookName);
	
	public List<Book> findByAuthorName(String authorName);
}
