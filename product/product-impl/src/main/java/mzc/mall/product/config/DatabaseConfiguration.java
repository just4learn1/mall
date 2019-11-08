package mzc.mall.product.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * create by zhencai.ma on 2019/10/30
 *
 * 自定义的configuration需要在@SpringBootApplication(scanBasePackages={"mzc.mall.product.config"}) 加入扫描此类所在包的父路径(可以多层嵌套)，否则无效
 */
@Configuration
@MapperScan("mzc.mall.product.dao")     //扫描对应的mapper 接口
@EnableTransactionManagement(proxyTargetClass = true)
//启动事务管理。为什么使用 proxyTargetClass 参数，参见 https://blog.csdn.net/huang_550/article/details/76492600
public class DatabaseConfiguration {

    public DatabaseConfiguration(){
        System.out.println("测试初始化");
    }

//    @Value("${spring.application.name}")
//    private String applicationId;
//    @Value("${seata.tx-service-group}")
//    private String txServiceGroup;

    @Bean("druidDataSource")                //映射mybatis的datasouce到druid，接入druid的连接池
    @ConfigurationProperties("spring.datasource.druid")
    public DruidDataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

//    public DataSource dataSource() {
//        DruidDataSource druidDataSource = druidDataSource();
//        return new DataSourceProxy(druidDataSource);
//    }

}
