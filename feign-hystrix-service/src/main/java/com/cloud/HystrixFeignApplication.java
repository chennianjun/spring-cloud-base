package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @project:spring-cloud
 * @package:com.cloud
 * @create_date:2018/3/20 16:09
 * @author:Subtimental
 * @description:TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HystrixFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignApplication.class,args);
    }
}
