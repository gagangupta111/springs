package com.spring.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.config.*;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        MoonBean moonBean = (MoonBean) context.getBean("MoonBean");
        moonBean.printMsg("Hello 1");

        SunBean sunBean = (SunBean) context.getBean("SunBean");
        sunBean.printMsg("Hello 2");

    }
}