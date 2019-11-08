package mzc.mall.product.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

/**
 * create by zhencai.ma on 2019/10/30
 */
@Configuration
public class ServiceTipsConfiguration {

    @EventListener(ApplicationReadyEvent.class) // 可参考 https://www.cnblogs.com/ssslinppp/p/7607509.html
    public void initMessage() {
        //初始化错误提示信息
    }
}
