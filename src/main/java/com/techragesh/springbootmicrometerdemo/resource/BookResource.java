package com.techragesh.springbootmicrometerdemo.resource;

import com.techragesh.springbootmicrometerdemo.model.Book;
import com.techragesh.springbootmicrometerdemo.service.BookService;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookResource {

    @Autowired
    private BookService bookService;

    @Timed(
            value = "techragesh.book.all",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @Timed(
            value = "techragesh.book.getById",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        return bookService.getBookById(id).map(book -> {
            return ResponseEntity.ok(book);
        }).orElseGet(() -> {
            return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
        });
    }

    @Timed(
            value = "techragesh.book.add",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return bookService.saveorupdateBook(book).map(p -> {
            return ResponseEntity.ok(p);
        }).orElseGet(() -> {
            return new ResponseEntity<Book>(HttpStatus.EXPECTATION_FAILED);
        });
    }

    @Timed(
            value = "techragesh.book.edit",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @PutMapping("/update")
    public ResponseEntity<Book> editBook(@RequestBody Book book) {
        return bookService.saveorupdateBook(book).map(p -> {
            return ResponseEntity.ok(p);
        }).orElseGet(() -> {
            return new ResponseEntity<Book>(HttpStatus.EXPECTATION_FAILED);
        });
    }

    @Timed(
            value = "techragesh.book.delete",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int bookId){
        if(bookService.deleteBookById(bookId)) {
            return ResponseEntity.ok("Book is removed");
        } else {
            return new ResponseEntity<String>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
