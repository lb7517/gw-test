package com.lb.gw.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FallBackController {

    private final static Logger LOGGER = LoggerFactory.getLogger(FallBackController.class);

    @GetMapping("/fallback")
    public String fallback() {
        List a = new ArrayList();
        LOGGER.error("熔断处理");
        return "服务异常";
    }
}


