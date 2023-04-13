package com.offcn.service;

import com.offcn.pojo.Result;
import com.offcn.pojo.User;
import com.offcn.pojo.Useress;

public interface UserService {
    Integer add(User user);
    Result findAll();
    Integer addUl(Useress useress);

    User findId(Integer id);

    Integer delete(Integer id);
}
