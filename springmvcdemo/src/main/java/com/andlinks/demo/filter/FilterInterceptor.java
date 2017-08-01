package com.andlinks.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 陈亚兰 on 2017/7/12.
 */
public class FilterInterceptor implements HandlerInterceptor {
    private static final Logger log=LoggerFactory.getLogger(FilterInterceptor.class);
    /**
     * 当目标方法执行之前，执行此方法，如果返回false,则不会执行目标方法，同样的，后面的拦截器也不起作用
     * 可以用来做权限，日志
     */
    public boolean preHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {
        log.info("首先来执行preHandler");
        return true;
    }

    /**
     * 执行目标方法之后调用，但是在渲染试图之前，就是转向jsp页面之前
     * 可以对请求域中的属性，后者试图进行修改
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
      log.info("我要改变视图了");
    }

    /**
     * 在渲染视图之后被调用
     * 释放资源
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
      log.info("释放资源");
    }

}
