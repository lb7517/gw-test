package com.lb.gw.filter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 根据Hostname进行限流
 * */
@Configuration
public class HostAddrKeyResolver {

    /*@Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }

    @Bean
    public HostAddrKeyResolver hostAddrKeyResolver() {
        return new HostAddrKeyResolver();
    }*/

    @Bean
    public KeyResolver hostAddrKeyResolverObj(){
        System.out.println("##############ipKeyResolver########################");
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
