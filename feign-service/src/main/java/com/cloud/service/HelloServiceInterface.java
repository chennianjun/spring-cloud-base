package com.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @project:spring-cloud
 * @package:com.cloud.service
 * @create_date:2018/3/20 13:49
 * @author:Subtimental
 * @description:TODO
 */
@FeignClient(value = "SERVICE-CLIENT")
public interface HelloServiceInterface {

    @GetMapping("index")
    String sayHiFromClientOne(@RequestParam("name") String name);

}
