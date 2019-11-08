package mzc.mall.common.dataobject;

import com.baomidou.mybatisplus.annotation.TableLogic;

/**
 * create by zhencai.ma on 2019/10/31
 */
public class DeletableDO extends BaseDO{

    /**
     * 是否删除
     */
    @TableLogic     //加此注解在执行deleteById时会执行更新而不是删除操作
    private Integer deleted;

    @Override
    public String toString() {
        return "DeletableDO{" +
                "delelted=" + deleted +
                '}';
    }

    public Integer getDelelted() {
        return deleted;
    }

    public void setDelelted(Integer delelted) {
        this.deleted = delelted;
    }
}
