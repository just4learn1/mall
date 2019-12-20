package mzc.mall.search.service;

import mzc.mall.search.api.bo.ProductConditionBO;
import mzc.mall.search.api.bo.ProductPageBO;
import mzc.mall.search.api.dto.ProductConditionDTO;
import mzc.mall.search.api.dto.ProductSearchPageDTO;
import mzc.mall.search.api.service.ProductSearchService;
import org.springframework.stereotype.Service;

/**
 * create by zhencai.ma on 2019/11/20
 */
@Service
@org.apache.dubbo.config.annotation.Service(validation = "false")       //测试先不需要版本校验
public class ProductSearchServiceImpl implements ProductSearchService {
    @Override
    public Integer rebuild() {
        return null;
    }

    @Override
    public Boolean save(Integer id) {
        return null;
    }

    @Override
    public ProductPageBO getSearchPage(ProductSearchPageDTO searchPageDTO) {
        return null;
    }

    @Override
    public ProductConditionBO getSearchCondition(ProductConditionDTO conditionDTO) {
        return null;
    }
}
