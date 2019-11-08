package mzc.mall.product.service;

import mzc.mall.product.dao.ProductCategoryMapper;
import mzc.mall.product.daoobject.ProductCategoryDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by zhencai.ma on 2019/10/31
 */
@Service
//@org.apache.dubbo.config.annotation.Service(validation = "true", version = "${dubbo.provider.ProductCategoryService.version}")
public class ProductCategoryServiceImpl {

    @Autowired
    private ProductCategoryMapper mapper;

    public ProductCategoryDO getById(Integer id) {
        ProductCategoryDO productCategoryDO = mapper.selectById(id);
        return productCategoryDO;
    }

    public void insert(ProductCategoryDO productCategoryDO) {
        mapper.insert(productCategoryDO);
    }

    public void update(ProductCategoryDO productCategoryDO) {
    }
}
