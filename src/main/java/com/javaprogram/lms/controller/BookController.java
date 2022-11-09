package com.javaprogram.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaprogram.lms.model.Book;
import com.javaprogram.lms.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@GetMapping("listbooks")
	public List<Book> listAllBooks() {
		return bookService.getAllBooks();
	}

	@PostMapping("/updatebook")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}

	@DeleteMapping("/deletebook/{bookId}")
	public void deleteBook(@PathVariable Long bookId) {
		bookService.deleteBook(bookId);
	}

	@GetMapping("listbookbyid/{bookId}")
	public Book listBookById(@PathVariable Long bookId) {
		return bookService.getBookById(bookId);
	}

	@GetMapping("listbookbyname/{bookName}")
	public List<Book> listBookByName(@PathVariable String bookName) {
		return bookService.getBookByName(bookName);
	}

	@GetMapping("listbookbyauthor/{authorName}")
	public List<Book> listBookByAuthor(@PathVariable String authorName) {
		return bookService.getBookByAuthor(authorName);
	}
}
