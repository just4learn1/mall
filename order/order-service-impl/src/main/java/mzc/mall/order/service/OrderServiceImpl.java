package mzc.mall.order.service;

import mzc.mall.common.vo.CommonResult;
import mzc.mall.order.api.dto.OrderCreateDTO;
import mzc.mall.order.api.service.OrderService;
import mzc.mall.order.bo.OrderCreateBO;
import mzc.mall.order.convert.OrderItemConvert;
import mzc.mall.order.dao.OrderItemMapper;
import mzc.mall.order.daoobject.OrderItemDO;
import mzc.mall.product.api.bo.ProductSkuDetailBO;
import mzc.mall.product.api.service.ProductSpuService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * create by zhencai.ma on 2019/11/1
 */
@Service
@org.apache.dubbo.config.annotation.Service(validation = "false", version = "1.0.1")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderItemMapper mapper;
    @Reference(validation = "true", version = "1.0.1")
    private ProductSpuService productSpuService;

    public CommonResult<OrderCreateBO> createOrder(OrderCreateDTO orderCreateDTO) {
        Integer userId = orderCreateDTO.getUserId();
        List<OrderCreateDTO.OrderItem> orderItemList = orderCreateDTO.getOrderItems();
        List<OrderItemDO> orderItemDOList = OrderItemConvert.INSTANCE.convert(orderItemList);

        Set<Integer> skuIds = orderItemDOList.stream().map(OrderItemDO :: getSkuId).collect(Collectors.toSet());
        List<ProductSkuDetailBO> productList = productSpuService.getProductSkuDetailList(skuIds);
        return null;
    }
}
