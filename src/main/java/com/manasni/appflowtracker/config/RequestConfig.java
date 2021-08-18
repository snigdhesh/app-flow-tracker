package com.manasni.appflowtracker.config;

import com.manasni.appflowtracker.interceptor.RequestHeaderInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvcConfigurer has set of methods to register interceptors. - In our case, we are registering RequestHeaderInterceptor.
 */
@Configuration
public class RequestConfig implements WebMvcConfigurer {

    private final RequestHeaderInterceptor requestHeaderInterceptor;

    @Autowired
    public RequestConfig(RequestHeaderInterceptor requestHeaderInterceptor) {
        this.requestHeaderInterceptor = requestHeaderInterceptor;
    }

    public void addInterceptors(InterceptorRegistry interceptorRegistry) {
        interceptorRegistry.addInterceptor(requestHeaderInterceptor);
    }
}

