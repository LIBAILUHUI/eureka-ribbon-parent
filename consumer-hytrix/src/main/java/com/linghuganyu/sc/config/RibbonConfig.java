package com.linghuganyu.sc.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/16
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    RestTemplate template(){
        return new RestTemplate();
    }


    @Bean
    public IRule iRule(){
        return new RoundRobinRule();
    }
}
