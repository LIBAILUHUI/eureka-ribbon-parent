package com.linghuganyu.sc;

import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan("com.linghuganyu.sc.mapper")
public class StartUserService {

    public static void main(String[] args) {

        SpringApplication.run(StartUserService.class,args);
    }
}
