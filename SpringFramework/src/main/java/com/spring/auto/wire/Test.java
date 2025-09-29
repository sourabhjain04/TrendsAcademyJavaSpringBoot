package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Test {
    public static void main(String[] args) {

        System.out.println("Hello");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/spring/auto/wire/config.xml");

        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1);

    }
}
