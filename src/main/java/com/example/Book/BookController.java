package com.example.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    @Autowired
    BookService bookService;

    @PostMapping("/book/add")
    public ResponseEntity addBook(@RequestBody Book book){

        bookService.addBook(book);
        return new ResponseEntity<>("success",HttpStatus.CREATED);
    }

    @GetMapping("/book/get/{name}")
    public Book getBook(@PathVariable("name") String name){

        return bookService.getBook(name);
    } 
}
