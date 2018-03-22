package com.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @project:spring-cloud
 * @package:com.cloud.service
 * @create_date:2018/3/20 12:24
 * @author:Subtimental
 * @description:TODO
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String indexService(String name){
        return restTemplate.getForObject("http://SERVICE-CLIENT/index?name="+name,String.class);
    }
}
