package com.cloud.service;

import com.cloud.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @project:spring-cloud
 * @package:com.cloud.service
 * @create_date:2018/3/20 16:11
 * @author:Subtimental
 * @description:TODO
 */
@FeignClient(value = "SERVICE-CLIENT",fallback = HelloServiceImpl.class)
public interface HelloService {
    @GetMapping("/index")
    String index(@RequestParam("name") String name);
}
