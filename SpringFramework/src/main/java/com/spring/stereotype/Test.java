package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/spring/stereotype/config.xml");

        Student student = context.getBean("ob", Student.class);
        System.out.println(student.hashCode());
        Student student1 = context.getBean("ob", Student.class);
        System.out.println(student1.hashCode());
    }
}
