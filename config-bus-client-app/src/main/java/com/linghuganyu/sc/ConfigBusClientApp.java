package com.linghuganyu.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigBusClientApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigBusClientApp.class,args);
    }
}
