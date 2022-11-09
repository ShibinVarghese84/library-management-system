package com.javaprogram.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprogram.lms.model.Book;
import com.javaprogram.lms.repository.BookRepository;
import com.javaprogram.lms.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBook(Long bookId) {
		bookRepository.deleteById(bookId);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(Long bookId) {
		return bookRepository.findById(bookId).get();
	}

	@Override
	public List<Book> getBookByName(String bookName) {
		return bookRepository.findByBookName(bookName);
	}

	@Override
	public List<Book> getBookByAuthor(String authorName) {
		return bookRepository.findByAuthorName(authorName);
	}

	@Override
	public Book updateBook(Book book) {

		Book existingBook = bookRepository.findById(book.getBookId()).get();
		existingBook.setBookName(book.getBookName());
		existingBook.setAuthorName(book.getAuthorName());
		existingBook.setPrice(book.getPrice());
		existingBook.setQuantity(book.getQuantity());

		return bookRepository.save(existingBook);
	}

}
