package com.alibaba.fescar.account;

import com.alibaba.fescar.account.service.AccountService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AccountBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AccountBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
