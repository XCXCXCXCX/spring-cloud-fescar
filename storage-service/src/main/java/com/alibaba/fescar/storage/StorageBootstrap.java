package com.alibaba.fescar.storage;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class StorageBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(StorageBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
