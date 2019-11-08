package mzc.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * create by zhencai.ma on 2019/11/4
 */
@SpringBootApplication(scanBasePackages = "mzc.mall.order")
@EnableAsync(proxyTargetClass = true)
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }
}
