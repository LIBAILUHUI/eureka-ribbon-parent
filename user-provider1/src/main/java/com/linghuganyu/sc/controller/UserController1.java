package com.linghuganyu.sc.controller;

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
public class UserController1 {

    @RequestMapping("getUserNameById")
    public String getUserNameById(@RequestParam(value = "uid",defaultValue = "1") Integer id){
        return "userprovider1 -> username: "+id;
    }

    @RequestMapping("testlist")
    public List<String> testlist(){
        List<String> list = new ArrayList<>();
        list.add("No.3");
        list.add("No.4");
        return list;
    }

}
