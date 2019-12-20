package mzc.mall.search.api.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * create by zhencai.ma on 2019/11/20
 */
@Data
@Accessors(chain = true)
public class ProductPageBO implements Serializable {
    /**
     * 管理员数组
     */
    private List<ProductBO> list;
    /**
     * 总量
     */
    private Integer total;
}
