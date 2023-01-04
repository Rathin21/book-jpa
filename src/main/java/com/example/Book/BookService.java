package com.example.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    @Autowired
    BookRepository bookRepository;

    public void addBook(Book book){

        bookRepository.save(book);
    }

    public Book getBook(String name){

       return bookRepository.findByname(name);
    }
}
