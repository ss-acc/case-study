package com.example.bookservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookServiceController {
	
	
	@Autowired
	private BookServiceRepository repository;
	
/*	@GetMapping("/get/books/{bookname}")
	public BookService retrieveBookService(@PathVariable String bookname )	{
		
		BookService bookService = repository.findByBookname(bookname);
		
		if (bookService == null){
			throw new RuntimeException("Notfound");
		}

		return bookService;*/
		
		
	@GetMapping("/get/books")
	public List<BookService> getAllBooks() {
        return repository.findAll();
    }
	
	@GetMapping("/get/bookidavailability/{bookid}")
	public BookService retrieveBookService(@PathVariable String bookid )	{
		
		BookService bookService = repository.findByBookid(bookid);
		
		/*if (bookService == null){
			throw new RuntimeException("Notfound");
		}*/

		/*return new BookService(bookid,bookService.getBookname(),bookService.getAuthor(),
				bookService.getAvailablecopies(),bookService.getTotalcopies());*/
		
		return bookService;
    }
		
}

	
	


