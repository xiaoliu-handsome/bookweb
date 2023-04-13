package com.offcn.service;

import com.offcn.pojo.Book;

import java.util.List;

public interface BookService {

    public Integer add(Book book) ;

    List<Book> findAll();


    Integer update(Book book);

    Integer delete(Integer id);
}
