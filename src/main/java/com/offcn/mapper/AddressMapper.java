package com.offcn.mapper;

import com.offcn.pojo.Address;
import com.offcn.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {

    Integer add(Address address) ;

    Integer del(Integer id);

    Integer update(Address address);

    List<Book> findAll();
}
