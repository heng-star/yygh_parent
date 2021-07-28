package com.atguigu.yygh.cmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan(basePackages = {"com.atguigu"})
@EnableDiscoveryClient//启动nacos
//@EnableFeignClients(basePackages = "com.atguigu")
@CrossOrigin
public class ServiceCmnApplication {
    public static void main(String[] args) {

        SpringApplication.run(ServiceCmnApplication.class, args);
    }
}
