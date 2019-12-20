package mzc.mall.search.api.service;

import mzc.mall.search.api.bo.ProductConditionBO;
import mzc.mall.search.api.bo.ProductPageBO;
import mzc.mall.search.api.dto.ProductConditionDTO;
import mzc.mall.search.api.dto.ProductSearchPageDTO;

/**
 * create by zhencai.ma on 2019/11/20
 */
public interface ProductSearchService {

    Integer rebuild();

    /**
     * 构建商品的搜索索引
     * @param id  商品编号
     * @return  构建结果
     */
    Boolean save(Integer id);

    ProductPageBO getSearchPage(ProductSearchPageDTO searchPageDTO);

    ProductConditionBO getSearchCondition(ProductConditionDTO conditionDTO);
}
