package mzc.mall.common.vo;

/**
 * create by zhencai.ma on 2019/11/20
 */
public class SortingField {
    /**
     * 字段
     */
    private String field;
    /**
     * 排序
     */
    private String order;

    public SortingField(String field, String order) {
        this.field = field;
        this.order = order;
    }

    public String getField() {
        return field;
    }

    public SortingField setField(String field) {
        this.field = field;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public SortingField setOrder(String order) {
        this.order = order;
        return this;
    }
}
