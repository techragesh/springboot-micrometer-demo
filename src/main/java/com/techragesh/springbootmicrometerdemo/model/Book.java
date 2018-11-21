package com.techragesh.springbootmicrometerdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    private int bookId;
    private String name;
    private String author;
    private String publisher;
}
