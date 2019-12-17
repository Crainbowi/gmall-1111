package com.atwenzhen.gmall.pms.service.impl;

import com.atwenzhen.gmall.pms.entity.Product;
import com.atwenzhen.gmall.pms.mapper.ProductMapper;
import com.atwenzhen.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-12-17
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
