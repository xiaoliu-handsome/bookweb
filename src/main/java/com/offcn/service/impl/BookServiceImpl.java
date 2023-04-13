package com.offcn.service.impl;

import com.offcn.mapper.BookMapper;
import com.offcn.pojo.Book;
import com.offcn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:rengl
 * 2023-04-08 08:42
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public Integer add(Book book) {
        return bookMapper.add(book);
    }

    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @Override
    public Integer update(Book book) {
        return bookMapper.update(book);
    }

    @Override
    public Integer delete(Integer id) {
        return bookMapper.del(id);
    }
}
