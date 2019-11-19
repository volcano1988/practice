package com.cc.service.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootConfiguration
public class ServiceApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Class[]{ServiceApplication.class}, args);
    }
}

