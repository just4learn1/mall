package mzc.mall.common.dataobject;

import java.io.Serializable;

/**
 * create by zhencai.ma on 2019/10/30
 * DO(dataObject)
 */
public class BaseDO implements Serializable {
    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    @Override
    public String toString() {
        return "BaseDO{" +
                "createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
