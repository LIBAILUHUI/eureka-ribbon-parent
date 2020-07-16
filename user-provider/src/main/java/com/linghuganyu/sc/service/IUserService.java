package com.linghuganyu.sc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.linghuganyu.sc.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lh
 * @since 2020-07-16
 */
public interface IUserService extends IService<User> {


    IPage<User> selectByVo(Page<User> page, User vo);
}
