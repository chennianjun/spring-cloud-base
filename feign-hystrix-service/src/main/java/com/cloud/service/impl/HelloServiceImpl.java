package com.cloud.service.impl;

import com.cloud.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @project:spring-cloud
 * @package:com.cloud.service.impl
 * @create_date:2018/3/20 16:14
 * @author:Subtimental
 * @description:TODO
 */
@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String index(String name) {
        return "error "+name;
    }
}
