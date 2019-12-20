package mzc.mall.search.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import mzc.mall.common.util.CollectionUtil;
import mzc.mall.common.vo.SortingField;

import java.util.List;
import java.util.Set;

/**
 * create by zhencai.ma on 2019/11/20
 */
@Data
@Accessors(chain = true)
public class ProductSearchPageDTO {

    public static final Set<String> SORT_FIELDS = CollectionUtil.asSet("buyPrice");
    /**
     * 分类编号
     */
    private Integer cid;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 页码
     */
    private Integer pageNo;
    /**
     * 分页大小
     */
    private Integer pageSize;
    /**
     * 排序字段数组
     */
    private List<SortingField> sorts;
}
