package com.atwenzhen.gmall.pms;

import com.atwenzhen.gmall.pms.entity.Brand;
import com.atwenzhen.gmall.pms.entity.Product;
import com.atwenzhen.gmall.pms.service.BrandService;
import com.atwenzhen.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GmallPmsApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
//		Product byId = productService.getById(1);
//		System.out.println(byId.getName());
		//测试增删改在主库，查在从库
//		Brand brand = new Brand();
//		brand.setName("哈哈哈");
//		brandService.save(brand);
//		System.out.println("保存成功......");
		Brand byId = brandService.getById(53);
		System.out.println("查询成功...."+byId);
	}

}
