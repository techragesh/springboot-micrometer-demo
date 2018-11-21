package com.techragesh.springbootmicrometerdemo.dao;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@Data
@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    @NotEmpty
    private String bookName;

    @NotEmpty
    private String author;

    @NotEmpty
    private String publisher;

    public BookEntity(String bookName, String author, String publisher) {
        super();
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }

    public BookEntity(int bookId, String bookName, String author, String publisher) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }
}
