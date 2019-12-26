package com.lb.gw.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RouteLocatorConfig {

//    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-info", r -> r.path("/user/**")
                        .uri("http://10.10.32.40:8080/"))
                .build();
    }
}
