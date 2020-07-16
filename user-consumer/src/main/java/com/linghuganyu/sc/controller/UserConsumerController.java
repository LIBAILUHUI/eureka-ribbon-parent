package com.linghuganyu.sc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linghuganyu.sc.entity.User;
import com.linghuganyu.sc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/16
 */
@RestController
public class UserConsumerController {

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


    @RequestMapping("list")
    public List<User> list(){
        return userService.list();
    }


    @RequestMapping("selectByVo")
    public Page<User> selectByVo(@RequestParam(defaultValue = "1") long current, @RequestParam(defaultValue = "3") long size, User vo){
        return userService.selectByVo(current, size, vo);
    }
}
