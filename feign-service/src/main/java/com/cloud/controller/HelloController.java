package com.cloud.controller;

import com.cloud.service.HelloServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project:spring-cloud
 * @package:com.cloud.controller
 * @create_date:2018/3/20 13:51
 * @author:Subtimental
 * @description:TODO
 */
@RestController
public class HelloController {

    @Autowired
    HelloServiceInterface helloServiceInterface;

    @GetMapping("/index")
    public String hi(@RequestParam String name){
        return helloServiceInterface.sayHiFromClientOne("feign "+name);
    }

}
