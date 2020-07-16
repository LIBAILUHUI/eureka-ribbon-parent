package com.linghuganyu.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/16
 */
@SpringBootApplication
@EnableEurekaClient
public class StartUserService1 {

    public static void main(String[] args) {
        SpringApplication.run(StartUserService1.class,args);
    }
}
