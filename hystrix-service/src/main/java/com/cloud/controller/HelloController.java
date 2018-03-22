package com.cloud.controller;

import com.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project:spring-cloud
 * @package:com.cloud.controller
 * @create_date:2018/3/20 14:22
 * @author:Subtimental
 * @description:TODO
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi")
    public String index(@RequestParam String name){
        return helloService.hiService(name);
    }

}
