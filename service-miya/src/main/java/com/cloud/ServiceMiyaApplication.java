package com.cloud;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @project:spring-cloud
 * @package:com.cloud
 * @create_date:2018/3/22 16:48
 * @author:Subtimental
 * @description:TODO
 */
@SpringBootApplication
@RestController
public class ServiceMiyaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceMiyaApplication.class,args);
    }
    private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi(){
        LOG.log(Level.INFO,"hi is being called");
        return "hi i'm miya";
    }

    @GetMapping("/miya")
    public String info(){
        LOG.info("info is being called");
        return restTemplate.getForObject("http://localhost:9410/info",String.class);
    }
}
