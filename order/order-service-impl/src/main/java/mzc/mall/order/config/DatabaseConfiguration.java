package mzc.mall.order.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * create by zhencai.ma on 2019/11/1
 */
@Configuration
@MapperScan("mzc.mall.order")
@EnableTransactionManagement(proxyTargetClass = true)
public class DatabaseConfiguration {

    @Bean("druidDataSource")
    @ConfigurationProperties("spring.datasource.druid")
    public DataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}
