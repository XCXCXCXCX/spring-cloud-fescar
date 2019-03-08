package com.alibaba.fescar.business;

import com.alibaba.fescar.business.service.OrderService;
import com.alibaba.fescar.business.service.StorageService;
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
@EnableFeignClients(clients = {OrderService.class, StorageService.class})
@SpringBootApplication
public class BusinessBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BusinessBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
