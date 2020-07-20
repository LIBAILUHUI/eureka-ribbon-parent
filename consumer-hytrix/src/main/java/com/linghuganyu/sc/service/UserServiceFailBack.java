package com.linghuganyu.sc.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linghuganyu.sc.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @description 服务降级的熔断调用实现类
 * @date 2020/7/17
 */
@Component
public class UserServiceFailBack implements UserService{
    @Override
    public String getUserNameById(Integer id) {
        return "没有得到编号为"+id+"的用户";
    }

    @Override
    public List<String> testlist() {
        List<String> list = new ArrayList<>();
        list.add("nothing");
        return list;
    }

    @Override
    public List<User> list() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setUsername("guest");
        list.add(user);
        return list;
    }

    @Override
    public Page<User> selectByVo(long current, long size, User vo) {
        return null;
    }
}
