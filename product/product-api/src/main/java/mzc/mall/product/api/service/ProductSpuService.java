package mzc.mall.product.api.service;

import mzc.mall.product.api.bo.ProductSkuDetailBO;
import mzc.mall.product.api.bo.ProductSpuDetailBO;

import java.util.Collection;
import java.util.List;

/**
 * create by zhencai.ma on 2019/11/4
 */
public interface ProductSpuService {

    ProductSpuDetailBO getProductSpuDetail(Integer id);

    /**
     * 增量获得商品列表，按照lastId递增获得
     * @param lastId 最后查询的编号
     * @param limit 大小
     * @return 商品列表
     */
    List<ProductSpuDetailBO> getProductSpuDetailListForSync(Integer lastId, Integer limit);

    List<ProductSkuDetailBO> getProductSkuDetailList(Collection<Integer> ids);
}
