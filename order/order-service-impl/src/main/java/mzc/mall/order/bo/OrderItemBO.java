package mzc.mall.order.bo;

import lombok.Data;

/**
 * create by zhencai.ma on 2019/11/1
 */
@Data
public class OrderItemBO {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 订单编号
     */
    private Integer orderId;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 物流id
     */
    private Integer skuId;
    /**
     * 物流id
     */
    private Integer orderLogisticsId;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 商品图片
     */
    private String skuImage;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 原始单价，单位：分
     */
    private Integer originPrice;
    /**
     * 购买价格，单位：分
     */
    private Integer buyPrice;
    /**
     * 最终价格，单位：分
     */
    private Integer presentPrice;
    /**
     * 购买总金额，单位：分
     */
    private Integer buyTotal;
    /**
     * 优惠总金额，单位：分
     */
    private Integer discountTotal;
    /**
     * 最终总金额，单位：分
     */
    private Integer presentTotal;
    /**
     * 付款时间
     */
    private Long paymentTime;
    /**
     * 发货时间
     */
    private Long deliveryTime;
    /**
     * 收货时间
     */
    private Long receiverTime;
    /**
     * 成交时间
     */
    private Long closingTime;
    /**
     * 是否退货
     * - 1 没有
     * - 2 换货
     * - 3 退货
     * - 4 换货 + 退货
     */
    private Integer hasReturnExchange;
    /**
     * 发货方式
     * - 1 未选择
     * - 2 在线下单
     * - 3 自己联系快递
     * - 4 无物流
     */
    private Integer deliverType;
    /**
     * 状态
     *
     * - 1 待付款
     * - 2 待发货
     * - 3 已发货
     * - 4 已完成
     * - 5 已关闭
     */
    private Integer status;
}
