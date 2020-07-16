package com.linghuganyu.sc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linghuganyu.sc.entity.User;
import com.linghuganyu.sc.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lh
 * @since 2020-07-16
 */
public interface UserMapper extends BaseMapper<User> {


    IPage<User> selectByVo(Page<User> page,User vo);
}
