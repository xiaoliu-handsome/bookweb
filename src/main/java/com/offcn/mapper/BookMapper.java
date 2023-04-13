package com.offcn.mapper;

import com.offcn.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    Integer add(Book book) ;

    Integer del(Integer id);

    Integer update(Book book);

    List<Book> findAll();
}
