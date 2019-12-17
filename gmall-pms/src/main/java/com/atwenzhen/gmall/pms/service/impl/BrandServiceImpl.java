package com.atwenzhen.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atwenzhen.gmall.pms.entity.Brand;
import com.atwenzhen.gmall.pms.mapper.BrandMapper;
import com.atwenzhen.gmall.pms.service.BrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-12-17
 */
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
