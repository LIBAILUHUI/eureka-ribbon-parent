package com.linghuganyu.sc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linghuganyu.sc.entity.User;
import com.linghuganyu.sc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/16
 */
@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("getUserNameById")
    public String getUserNameById(@RequestParam(value = "uid",defaultValue = "1") Integer id){
        return "userprovider -> username: "+id;
    }

    @RequestMapping("testlist")
    public List<String> testlist(){
        List<String> list = new ArrayList<>();
        list.add("No.1");
        list.add("No.2");
        return list;
    }

    @RequestMapping("list")
    public List<User> list(){
        return iUserService.list();
    }

    @RequestMapping("selectByVo")
    public Page<User> selectByVo(@RequestParam(defaultValue = "1") long current,@RequestParam(defaultValue = "3") long size,User vo){
        Page<User> page = new Page<>();
        page.setCurrent(current);
        page.setSize(size);
        IPage<User> userIPage = iUserService.selectByVo(page, null);
        page.setRecords(userIPage.getRecords());
        page.setTotal(userIPage.getTotal());
        return page;
    }


    @RequestMapping("a")
    public String getA(){
        return "success a";
    }

}
