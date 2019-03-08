package com.alibaba.fescar.order;

import com.alibaba.fescar.order.service.AccountService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(clients = {AccountService.class})
public class OrderBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
