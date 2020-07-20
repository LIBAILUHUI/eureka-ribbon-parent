package com.linghuganyu.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/17
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixBoardApp {

    public static void main(String[] args) {
        SpringApplication.run(HystrixBoardApp.class, args);
    }
}
