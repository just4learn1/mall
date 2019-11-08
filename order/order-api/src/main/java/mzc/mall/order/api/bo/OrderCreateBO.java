package mzc.mall.order.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * create by zhencai.ma on 2019/11/4
 */
@Data
@Accessors(chain = true)
public class OrderCreateBO implements Serializable {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 订单金额
     */
    private Integer payAmount;
}
