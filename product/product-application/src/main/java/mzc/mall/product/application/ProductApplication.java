package mzc.mall.product.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * create by zhencai.ma on 2019/10/30
 */
@SpringBootApplication(scanBasePackages = {"mzc.mall.product"})
@EnableAsync(proxyTargetClass = true)
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
