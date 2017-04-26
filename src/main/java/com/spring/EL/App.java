package com.spring.EL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){

        // need to change autowiring in XML
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Customer obj = (Customer) context.getBean("customerBean");
        System.out.println(obj);
    }
}