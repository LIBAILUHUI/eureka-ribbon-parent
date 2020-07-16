package com.linghuganyu.sc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linghuganyu.sc.entity.Brand;
import com.linghuganyu.sc.mapper.BrandMapper;
import com.linghuganyu.sc.service.IBrandService;

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
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
