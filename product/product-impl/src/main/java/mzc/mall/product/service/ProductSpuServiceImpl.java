package mzc.mall.product.service;

import mzc.mall.product.api.bo.ProductSkuDetailBO;
import mzc.mall.product.api.bo.ProductSpuDetailBO;
import mzc.mall.product.api.service.ProductSpuService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * create by zhencai.ma on 2019/11/4
 */
@Service
@org.apache.dubbo.config.annotation.Service(validation = "true", version = "1.0.1")
public class ProductSpuServiceImpl implements ProductSpuService {
    @Override
    public ProductSpuDetailBO getProductSpuDetail(Integer id) {
        return null;
    }

    @Override
    public List<ProductSpuDetailBO> getProductSpuDetailListForSync(Integer lastId, Integer limit) {
        return null;
    }

    @Override
    public List<ProductSkuDetailBO> getProductSkuDetailList(Collection<Integer> ids) {
        System.out.println("执行到getProductSkuDetailList");
        RuntimeException e = new RuntimeException("run is here");
        e.fillInStackTrace();
        e.printStackTrace();
        return null;
    }
}
