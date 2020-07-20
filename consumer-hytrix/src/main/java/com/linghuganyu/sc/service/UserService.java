package com.linghuganyu.sc.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linghuganyu.sc.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="userprovider",fallback = UserServiceFailBack.class)
public interface UserService {

    @RequestMapping("getUserNameById")
    String getUserNameById(@RequestParam(value = "uid") Integer id);

    @RequestMapping("testlist")
    List<String> testlist();

    @RequestMapping("list")
    List<User> list();

    @RequestMapping("selectByVo")
    Page<User> selectByVo(@RequestParam(value = "current") long current, @RequestParam(value = "size") long size, @RequestParam(value = "vo") User vo);
}
