package mzc.mall.product.test;

import mzc.mall.product.application.ProductApplication;
import mzc.mall.product.dao.ProductCategoryMapper;
import mzc.mall.product.daoobject.ProductCategoryDO;
import mzc.mall.product.service.ProductCategoryServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * create by zhencai.ma on 2019/10/31
 */
@SpringBootTest(classes = ProductApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ProductTest {
    @Autowired
    private ProductCategoryServiceImpl service;

    @Test
    public void test() {
        ProductCategoryDO productCategoryDO = new ProductCategoryDO();
        productCategoryDO.setDescription("qwer")
                .setName("asdf")
                .setPicUrl("url")
                .setSort(1)
                .setStatus(2)
                .setPid(456)
                .setId(4564);
//        service.insert(productCategoryDO);
        ProductCategoryDO a = service.getById(4564);
        System.out.println(a);
    }
}
