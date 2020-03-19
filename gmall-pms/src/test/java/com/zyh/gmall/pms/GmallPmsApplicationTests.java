package com.zyh.gmall.pms;

import com.zyh.gmall.pms.entity.Brand;
import com.zyh.gmall.pms.entity.Product;
import com.zyh.gmall.pms.service.BrandService;
import com.zyh.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class GmallPmsApplicationTests {

    @Autowired
    private ProductService productService;
    
    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
//        Product product = productService.getById(1);
//        System.out.println(product);
        
        //测试增删改在主库
        Brand brand = new Brand();
//        brand.setName("哈哈哈");
//        brandService.save(brand);
//        System.out.println("保存成功");

        //测试查在从库
        Brand byId = brandService.getById(53);
        System.out.println("查询结果"+byId.getName());
    }

}
