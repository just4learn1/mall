package mzc.mall.common.vo;

import java.io.Serializable;

/**
 * create by zhencai.ma on 2019/11/4
 */
public final class CommonResult<T> implements Serializable {

    public static Integer CODE_SUCCESS = 0;
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 错误提示
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
