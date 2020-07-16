package com.linghuganyu.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 * @description 启动注册中心
 * @date 2020/7/16
 */
@SpringBootApplication
@EnableEurekaServer
public class StartServer {

    public static void main(String[] args) {
        SpringApplication.run(StartServer.class,args);
    }
}
