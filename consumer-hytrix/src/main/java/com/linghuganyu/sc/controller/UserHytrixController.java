package com.linghuganyu.sc.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linghuganyu.sc.entity.User;
import com.linghuganyu.sc.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/16
 */
@RestController
public class UserHytrixController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @RequestMapping("getUserName")
    public String getUserName(@RequestParam(defaultValue = "0") Integer id){
        return restTemplate.getForObject("http://USERPROVIDER/getUserNameById?uid="+id,String.class);
    }


    @RequestMapping("getUserNameFeign")
    public String getUserNameFegion(@RequestParam(defaultValue = "0") Integer id){
        return userService.getUserNameById(id);
    }



    @RequestMapping("listFeign")
    public List<String> listFeign(){
        return userService.testlist();
    }

    //@HystrixCommand注解需要spring-cloud-starter-netflix-hystrix依赖
    @HystrixCommand(fallbackMethod = "listFailBackMethod")
    @RequestMapping("list")
    public List<User> list(){
        return userService.list();
    }


    @RequestMapping("selectByVo")
    public Page<User> selectByVo(@RequestParam(defaultValue = "1") long current, @RequestParam(defaultValue = "3") long size, User vo){
        return userService.selectByVo(current, size, vo);
    }


    public List<User> listFailBackMethod(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setUsername("admin HystrixCommand");
        list.add(user);
        return list;
    }
}
