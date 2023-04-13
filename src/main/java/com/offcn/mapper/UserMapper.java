package com.offcn.mapper;

import com.offcn.pojo.Result;
import com.offcn.pojo.User;
import com.offcn.pojo.Useress;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Integer add(User user);
    Result findAll();
    Integer addUl(Useress useress);
    User findId(Integer id);
    Integer del(Integer id);
}
