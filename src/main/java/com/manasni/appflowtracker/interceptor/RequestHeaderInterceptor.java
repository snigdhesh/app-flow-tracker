package com.manasni.appflowtracker.interceptor;

import com.manasni.appflowtracker.service.AppHeaderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RequestHeaderInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(RequestHeaderInterceptor.class);

    private final AppHeaderService appHeaderService;

    @Autowired
    public RequestHeaderInterceptor(AppHeaderService appHeaderService) {
        this.appHeaderService = appHeaderService;
    }

    /**
     * Method that handles request, before hitting RequestController.java
     *
     * @param httpServletRequest  @description
     * @param httpServletResponse @description
     * @param handler             @description
     * @return @description
     * @throws Exception @description
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        for (String header : appHeaderService.getAppHeaders()) {
            MDC.put(header, httpServletRequest.getHeader(header));
            log.info("LIBRARY_ARTIFACT=APP-FLOW-TRACKER||{}={}", header, MDC.get(header));
        }
        return HandlerInterceptor.super.preHandle(httpServletRequest, httpServletResponse, handler);
    }

     // ----------------- Reference code -------------------
    /*
        //Method to handle any piece of code, after returning data from controller (RequestController.java)
        @Override
        public boolean postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) {}
    */


    /*
        //Method that handles any piece of code, after response is sent from controller (RequestController.java), and view is rendered.
        @Override
        public boolean afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) {}
    */
}
