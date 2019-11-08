package mzc.mall.order.controller.admin;

import mzc.mall.order.api.dto.OrderCreateDTO;
import mzc.mall.order.api.dto.OrderCreateDTO.OrderItem;
import mzc.mall.order.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * create by zhencai.ma on 2019/11/4
 */
@RestController
public class AdminController {
    @Autowired
    private OrderServiceImpl orderService;

    @RequestMapping("/")
    public void adminTmp() {
        OrderCreateDTO dto = new OrderCreateDTO()
                .setCouponCardId(1)
                .setIp("127.0.0.2")
                .setOrderItems(Arrays.asList(new OrderItem().setSkuId(2).setQuantity(3)))
                .setRemar("remar")
                .setUserAddressId(33)
                .setUserId(567);
        orderService.createOrder(dto);
        System.out.println("===============");
    }
}
