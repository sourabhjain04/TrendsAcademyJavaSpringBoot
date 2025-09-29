package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext
                context = new FileSystemXmlApplicationContext("src/main/java/com/spring/lifecycle/config.xml");
    Samosa s1 =(Samosa) context.getBean("s1");

    System.out.println(s1);

    context.registerShutdownHook();

    }
}
