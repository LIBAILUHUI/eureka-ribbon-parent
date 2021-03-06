package com.linghuganyu.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class StartUserConsumer {

    public static void main(String[] args) {
        SpringApplication.run(StartUserConsumer.class,args);
    }
}
