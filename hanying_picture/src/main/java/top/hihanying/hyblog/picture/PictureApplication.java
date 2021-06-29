package top.hihanying.hyblog.picture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;


@EnableTransactionManagement
@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
@EnableFeignClients("top.hihanying.hyblog.commons.feign")
@ComponentScan(basePackages = {
        "top.hihanying.hyblog.commons.config.feign",
        "top.hihanying.hyblog.commons.handler",
        "top.hihanying.hyblog.commons.config.redis",
        "top.hihanying.hyblog.utils",
        "top.hihanying.hyblog.picture"})
public class PictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(PictureApplication.class, args);
    }
}
