package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project:spring-cloud
 * @package:com.cloud
 * @create_date:2018/3/21 13:14
 * @author:Subtimental
 * @description:TODO
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }

    @Value("${appId}")
    private String appId;

    @GetMapping("/index")
    public String index(){
        System.out.println(appId);
        return appId;
    }
}
