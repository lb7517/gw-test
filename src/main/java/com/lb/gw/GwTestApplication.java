package com.lb.gw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class GwTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GwTestApplication.class, args);
    }

}
