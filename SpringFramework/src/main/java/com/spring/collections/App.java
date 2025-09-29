package com.spring.collections;

import com.spring.first.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
    System.out.println("Hello World");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/spring/collections/config.xml");
        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getCourses());

    }
}
