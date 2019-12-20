package mzc.mall.search.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Collection;

/**
 * create by zhencai.ma on 2019/11/20
 */
@Data
@Accessors(chain = true)
public class ProductConditionDTO {
    /**
     * field - 商品分类
     */
    public static final String FIELD_CATEGORY = "category";
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 需要返回的搜索条件的fields名
     */
    private Collection<String> fields;
}
