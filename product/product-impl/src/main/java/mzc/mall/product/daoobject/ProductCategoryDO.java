package mzc.mall.product.daoobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
import mzc.mall.common.dataobject.DeletableDO;
import org.apache.ibatis.type.Alias;

/**
 * create by zhencai.ma on 2019/10/31
 */
@Data
@Accessors(chain = true)  //使用此注解， setter方法返回的是this
@TableName("product_category")
public class ProductCategoryDO extends DeletableDO {
    /**
     * 分类编号
     */
    //mybatis plus默认TableId的type为AUTO(数据库自增)，因此在插入时自己设置的主键id是不生效的，需要设置下面注解才可以使用自己生成的id
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private Integer id;
    /**
     * 父分类编号 （没有则pid=0）
     */
    private Integer pid;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 图片
     */
    private String picUrl;
    /**
     * 排序值
     */
    private Integer sort;
    /**
     * 状态
     * 1-开启
     * 2-关闭
     */
    private Integer status;
}
