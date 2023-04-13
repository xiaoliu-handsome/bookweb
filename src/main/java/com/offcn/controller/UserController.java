package com.offcn.controller;

import com.offcn.pojo.Result;
import com.offcn.pojo.User;
import com.offcn.pojo.Useress;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/")
    public Integer add(@RequestBody User user){
        return userService.add(user);
    }
    @GetMapping("/")
    public Result findAll(){
        return userService.findAll();
    }

    @PostMapping("add")
    public Integer addUl(@RequestBody Useress useress){
        return userService.addUl(useress);
    }
    @GetMapping("/{id}")
    public Result findId(@PathVariable("id") Integer id) {
        User id1 = userService.findId(id);

        return new Result(true,"1",id1);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id) {
        Integer count = userService.delete(id);
        return new Result(true,"影响"+count+"条数据",count);
    }
}
