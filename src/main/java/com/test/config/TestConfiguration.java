package com.test.config;

import com.test.service.RequestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class TestConfiguration {

/*    @Bean
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }*/

/*    @Bean
    public RequestContextListener inheritableRequestContextListener(){
        return new InheritableRequestContextListener();
    }*/

    @Bean
    @Scope(scopeName = "request" , proxyMode = ScopedProxyMode.TARGET_CLASS)
    public RequestService requestService() {
        return new RequestService();
    }
}
