package com.linghuganyu.sc.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linghuganyu.sc.service.IUserService;
import com.linghuganyu.sc.entity.User;
import com.linghuganyu.sc.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lh
 * @since 2020-07-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public IPage<User> selectByVo(Page<User> page, User vo) {
        return baseMapper.selectByVo(page,vo);
    }
}
