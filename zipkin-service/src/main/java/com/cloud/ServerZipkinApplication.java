package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @project:spring-cloud
 * @package:com.cloud
 * @create_date:2018/3/22 16:33
 * @author:Subtimental
 * @description:TODO
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class,args);
    }
}
