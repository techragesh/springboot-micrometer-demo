package com.techragesh.springbootmicrometerdemo.service;

import com.techragesh.springbootmicrometerdemo.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Optional<Book> getBookById (int bookId);

    List<Book> getBooks();

    boolean deleteBookById(int bookId);

    Optional<Book> saveorupdateBook(Book book);
}
