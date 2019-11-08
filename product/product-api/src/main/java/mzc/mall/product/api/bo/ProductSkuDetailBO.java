package mzc.mall.product.api.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * create by zhencai.ma on 2019/11/4
 */
@Data
@Accessors(chain = true)
public class ProductSkuDetailBO implements Serializable {
    /**
     * sku编号
     */
    private Integer id;
    /**
     * SPU信息
     */
    private Spu spu;
    /**
     * 图片地址
     */
    private String picURL;
    /**
     * 价格， 单位：分
     */
    private Integer price;
    /**
     * 库存数量
     */
    private Integer quantity;

    @Data
    @Accessors(chain = true)
    public static class Spu implements Serializable {
        /**
         * SPU 编号
         */
        private Integer id;
        /**
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
         * 商品主图地址
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
    }
}
