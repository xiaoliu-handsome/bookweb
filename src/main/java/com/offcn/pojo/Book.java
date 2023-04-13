package com.offcn.pojo;

import java.io.Serializable;

/**
 * 图书bean
 * author:rengl
 * 2023-04-08 7:10
 */
public class Book implements Serializable {

    private Integer id;
    private String name;
    private String author;
    private Integer page;

    public Book() {
    }

    public Book(String name, String author, Integer page) {
        this.name = name;
        this.author = author;
        this.page = page;
    }

    public Book(Integer id, String name, String author, Integer page) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.page = page;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
