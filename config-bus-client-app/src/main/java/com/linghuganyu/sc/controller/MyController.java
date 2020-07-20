package com.linghuganyu.sc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/20
 */
@RestController
@RefreshScope
public class MyController {

    @Value("${mykey}")
    private String myValue;

    @RequestMapping("getVal")
    public String gteVal(){
        return "the value is :"+myValue;
    }


}
