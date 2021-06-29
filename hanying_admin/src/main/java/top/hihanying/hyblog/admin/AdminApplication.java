package top.hihanying.hyblog.admin;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * hanying-admin 启动类
 *
 * @author 应寒
 * @date 2020年12月31日21:26:04
 */
@EnableTransactionManagement
@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
@EnableCaching
@EnableRabbit
@EnableFeignClients("top.hihanying.hyblog.commons.feign")
@ComponentScan(basePackages = {
        "top.hihanying.hyblog.commons.config",
        "top.hihanying.hyblog.commons.fallback",
        "top.hihanying.hyblog.utils",
        "top.hihanying.hyblog.admin",
        "top.hihanying.hyblog.xo.utils",
        "top.hihanying.hyblog.xo.service"
})
public class AdminApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(AdminApplication.class, args);
    }

    /**
     * 设置时区
     */
    @PostConstruct
    void setDefaultTimezone() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }
}
