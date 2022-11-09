package com.javaprogram.lms.service;

import java.util.List;

import com.javaprogram.lms.model.Book;

public interface BookService {

	public Book addBook(Book book);

	public void deleteBook(Long bookId);

	public List<Book> getAllBooks();

	public Book getBookById(Long bookId);

	public List<Book> getBookByName(String bookName);

	public List<Book> getBookByAuthor(String authorName);

	public Book updateBook(Book book);
}
