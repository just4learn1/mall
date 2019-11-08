package mzc.mall.order.convert;

import mzc.mall.order.api.dto.OrderCreateDTO;
import mzc.mall.order.daoobject.OrderItemDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * create by zhencai.ma on 2019/11/1
 */
@Mapper(componentModel = "spring")
public interface OrderItemConvert {
    OrderItemConvert INSTANCE = Mappers.getMapper(OrderItemConvert.class);

    @Mappings({
    })
    List<OrderItemDO> convert(List<OrderCreateDTO.OrderItem> orderItemList);
}
