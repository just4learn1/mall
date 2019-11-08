package mzc.mall.order.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * create by zhencai.ma on 2019/11/4
 */
@Data
@Accessors(chain = true)
public class OrderCreateDTO implements Serializable {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户地址
     */
    private Integer userAddressId;
    /**
     * 优惠券编号
     */
    private Integer couponCardId;
    /**
     * 备注
     */
    private String remar;
    /**
     * ip信息
     */
    private String ip;

    private List<OrderItem> orderItems;

    @Data
    @Accessors(chain = true)
    public static class OrderItem {
        /**
         * 商品编号
         */
        private Integer skuId;
        /**
         * 数量
         */
        private Integer quantity;
    }
}
