package com.linghuganyu.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/17
 */
@Component
public class AuthFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    //可以写多个过滤器，数字越小，优先级别越高
    @Override
    public int filterOrder() {
        return 2;
    }


    //要不要过滤  false放行  true不放行
    @Override
    public boolean shouldFilter() {
        //获取上下文
        RequestContext context = RequestContext.getCurrentContext();
        String uri = context.getRequest().getRequestURI();
        System.out.println(uri);
        //如果是brand开头，就拦截，不是就不拦截
        if(uri.startsWith("/brand/")){
            System.out.println("过来了");
            return true;
        }

        return false;
    }


    //逻辑处理，核心部分，拦截之后做什么处理
    @Override
    public Object run() throws ZuulException {

        System.out.println("过滤器逻辑被执行了");
       RequestContext context = RequestContext.getCurrentContext();
        HttpServletResponse response = context.getResponse();
        context.setSendZuulResponse(false);
        //** http状态码，标识未授权 **//*
        context.setResponseStatusCode(401);
        //** 设置返回的内容类型 **//*
        response.setContentType("application/json;charset=utf-8");
        try {
            //** 输出返回结果 **//*
            response.getWriter().write("{\"message\":\"未授权\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    }

