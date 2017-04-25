package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring.core.*;

@Configuration
public class SunConfig {

    @Bean(name="SunBean")
    public SunBean customerBo(){

        return new SunBean();

    }
}