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
public class ProductBO implements Serializable {

    private Integer id;
    /***
     * SPU 名字
     */
    private String name;
    /**
     * 卖点
     */
    private String sellPoint;
    /**
     * 描述
     */
    private String description;
    /**
     * 分类编号
     */
    private Integer cid;
    /**
     * 商品主图url数组
     */
    private List<String> picUrls;
    /**
     * 是否上架
     * true 已上架
     * false 已下架
     */
    private Boolean visible;
    /**
     * 排序字段
     */
    private Integer sort;
    /**
     * 原始价格  单位：分
     */
    private Integer originalPrice;
    /**
     * 购买价格 单位：分
     */
    private Integer buyPrice;
    /**
     * 库存数量
     */
    private Integer quantity;
    /**
     * 促销活动编号
     */
    private Integer promotionActivityId;
    /**
     * 促销活动标题
     */
    private String promotionActivityTitle;
    /**
     * 促销活动类型
     */
    private Integer promotionActivityType;
}
