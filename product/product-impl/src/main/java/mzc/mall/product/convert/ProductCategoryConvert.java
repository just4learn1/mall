package mzc.mall.product.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * create by zhencai.ma on 2019/10/31
 */
@Mapper(componentModel = "spring")
public interface ProductCategoryConvert {
    ProductCategoryConvert INSTANCE = Mappers.getMapper(ProductCategoryConvert.class);

    //这地方加DO转换为BO的convert方法，mapstruct会自动生成对应字节码
}
