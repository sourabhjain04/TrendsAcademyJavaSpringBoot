package com.spring.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
    System.out.println("Hello World");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/spring/second/config.xml");
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

    }
}
