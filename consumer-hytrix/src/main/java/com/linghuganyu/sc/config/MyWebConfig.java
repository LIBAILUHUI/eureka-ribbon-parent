package com.linghuganyu.sc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Administrator
 * @description TODO
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    //日志
    private Logger logger = LoggerFactory.getLogger(MyWebConfig.class);


    /*统一跨域设置*/
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .maxAge(3600)
                .allowCredentials(true);
    }
}
