package com.linghuganyu.sc;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix   //使用HystrixCommand时候需要，并且需要spring-cloud-starter-netflix-hystrix依赖
public class StartHytrixConsumer {

    public static void main(String[] args) {
        SpringApplication.run(StartHytrixConsumer.class,args);
    }


    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registration.addUrlMappings("/actuator/hystrix.stream");
        return registration;
    }

}
