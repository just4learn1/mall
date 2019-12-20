package mzc.mall.order.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import mzc.mall.order.api.dto.OrderCreateDTO.OrderItem;
import mzc.mall.order.daoobject.OrderItemDO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-11-20T17:55:23+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
@Component
public class OrderItemConvertImpl implements OrderItemConvert {

    @Override
    public List<OrderItemDO> convert(List<OrderItem> orderItemList) {
        if ( orderItemList == null ) {
            return null;
        }

        List<OrderItemDO> list = new ArrayList<OrderItemDO>( orderItemList.size() );
        for ( OrderItem orderItem : orderItemList ) {
            list.add( orderItemToOrderItemDO( orderItem ) );
        }

        return list;
    }

    protected OrderItemDO orderItemToOrderItemDO(OrderItem orderItem) {
        if ( orderItem == null ) {
            return null;
        }

        OrderItemDO orderItemDO = new OrderItemDO();

        orderItemDO.setSkuId( orderItem.getSkuId() );
        orderItemDO.setQuantity( orderItem.getQuantity() );

        return orderItemDO;
    }
}
