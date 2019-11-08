package mzc.mall.order.api.service;

import mzc.mall.common.vo.CommonResult;
import mzc.mall.order.api.dto.OrderCreateDTO;
import mzc.mall.order.bo.OrderCreateBO;

/**
 * create by zhencai.ma on 2019/11/4
 */
public interface OrderService {
    CommonResult<OrderCreateBO> createOrder(OrderCreateDTO orderCreateDTO);
}
