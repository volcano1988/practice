package com.practice.spring5.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 自定义bean加载器
 *
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019-12-18
 */
public class CustomInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

    }

    public void mysqlInitialze(){
//        practice@2019
    }
}
