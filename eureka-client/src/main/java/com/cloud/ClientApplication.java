package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project:spring-cloud
 * @package:com.cloud
 * @create_date:2018/3/20 10:03
 * @author:Subtimental
 * @description:TODO
 */
@SpringBootApplication
//@EnableDiscoveryClient
@RestController
@EnableEurekaClient
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("index")
    public String index(@RequestParam String name){
        return "hi "+name+",i am from port:"+port;
    }

}
