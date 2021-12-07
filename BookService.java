package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BookRepository;
import com.app.model.Book;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	public List<Book> getAllBooks() {
		return (List<Book>) bookRepo.findAll();
	}
	public void deleteBook(int gin) {
		bookRepo.deleteById(gin);
	}
	public Book findBookByGin(int gin) {
		return bookRepo.findById(gin).get();
	}
}
