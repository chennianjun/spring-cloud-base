package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @project:spring-cloud
 * @package:com.cloud
 * @create_date:2018/3/20 13:47
 * @author:Subtimental
 * @description:TODO
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ServiceFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class,args);
    }
}
