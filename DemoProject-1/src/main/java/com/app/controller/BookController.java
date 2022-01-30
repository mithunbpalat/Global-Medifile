package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Book;
import com.app.service.BookService;

@RestController
@CrossOrigin("*")
public class BookController {
	@Autowired
	private BookService bookServ;
	
	@PostMapping(value="postbook")
	public List<Book> saveBook(@RequestBody Book book){
		System.out.println("Booking works");
		bookServ.saveBook(book);
		return bookServ.getAllBooks();
	}
	@PutMapping(value="updatebook")
	public List<Book> updateBook(@RequestBody Book book){
		System.out.println("Booking update works");
		bookServ.updateBook(book);
		return bookServ.getAllBooks();
	}
	@GetMapping(value="getallbooks")
	public List<Book> getAllBook(){
		return bookServ.getAllBooks();
	}
	@DeleteMapping(value="deletebookbyid")
	public List<Book> deleteBook(@RequestParam int gin){
		bookServ.deleteBook(gin);
		return bookServ.getAllBooks();
	}
	@GetMapping(value="getbookbyid")
	public Book getBookById(@RequestParam int gin){
		return bookServ.findBookByGin(gin);
	}
}
