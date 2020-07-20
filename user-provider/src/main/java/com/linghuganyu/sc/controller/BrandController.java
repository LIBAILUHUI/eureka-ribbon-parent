package com.linghuganyu.sc.controller;

import com.linghuganyu.sc.entity.Brand;
import com.linghuganyu.sc.service.IBrandService;
import com.linghuganyu.sc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/17
 */

@RestController
@RequestMapping("/brand")
public class BrandController {


    @Autowired
    private IBrandService iBrandService;


    @RequestMapping("a")
    public List<Brand> list(){
        return iBrandService.list();
    }
}
