package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring.core.*;

@Configuration
public class MoonConfig {

    @Bean(name="MoonBean")
    public MoonBean suchedulerBo(){

        return new MoonBean();

    }

}