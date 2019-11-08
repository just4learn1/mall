package mzc.mall.product.application.controller.admin;

import mzc.mall.product.service.ProductCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by zhencai.ma on 2019/10/30
 */
@RestController
//@RequestMapping("admins")
public class AdminProductController {

    @Autowired
    private ProductCategoryServiceImpl service;

    @RequestMapping("/")
    public void aaa() {
        System.out.println(service.getById(4564));
    }

}
