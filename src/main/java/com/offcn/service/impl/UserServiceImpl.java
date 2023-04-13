package com.offcn.service.impl;

import com.offcn.mapper.AddressMapper;
import com.offcn.mapper.UserMapper;
import com.offcn.pojo.Address;
import com.offcn.pojo.Result;
import com.offcn.pojo.User;
import com.offcn.pojo.Useress;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    AddressMapper addressMapper;

    @Override
    public Integer add(User user) {
        userMapper.add(user);
        List<Address> addressList = user.getAddressList();
        for (Address address : addressList) {
            addressMapper.add(address);
        }

        return 1;
    }
    public Result findAll(){
        return new Result(true,"成功",userMapper.findAll());
    }

    @Override
    public Integer addUl(Useress useress) {
        return userMapper.addUl(useress);
    }

    @Override
    public User findId(Integer id) {

        return userMapper.findId(id);
    }

    @Override
    public Integer delete(Integer id) {
        userMapper.del(id);
        addressMapper.del(id);
        return 1;
    }
}
