package com.offcn.controller;

import com.offcn.pojo.Book;
import com.offcn.pojo.Result;
import com.offcn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * author:rengl
 * 2023-04-08 7:25
 * 控制层三个核心功能:接,调,返
 */
@RequestMapping("book")
@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/")
    public Result add(@RequestBody Book book){
        Integer count = bookService.add(book);
        return new Result(true,"影响"+count+"条数据",count);
    }
    @GetMapping("/")
    public Result findAll() {
        List<Book> bookList = bookService.findAll();
        return new Result(true,"查询成功",bookList);
    }
    @PutMapping("/")
    public Result update(@RequestBody Book book) {
        Integer count = bookService.update(book);
        return new Result(true,"影响"+count+"条数据",count);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id) {
        Integer count = bookService.delete(id);
        return new Result(true,"影响"+count+"条数据",count);
    }
}
