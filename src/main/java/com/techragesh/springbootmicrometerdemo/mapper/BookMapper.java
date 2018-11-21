package com.techragesh.springbootmicrometerdemo.mapper;

import com.techragesh.springbootmicrometerdemo.dao.BookEntity;
import com.techragesh.springbootmicrometerdemo.model.Book;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel="spring")
public interface BookMapper {

    @Mappings({
        @Mapping(source = "bookName", target = "name")
    })
    Book toBook(BookEntity bookEntity);

    @InheritInverseConfiguration
    BookEntity fromBook(Book book);
}
