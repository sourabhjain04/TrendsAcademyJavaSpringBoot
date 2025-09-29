package com.spring.ref;

import com.spring.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
    System.out.println("Hello World");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/spring/ref/config.xml");
       A temp=(A) context.getBean("aref");
       System.out.println(temp.getX());
       System.out.println(temp.getOb().getY());
       System.out.println(temp);

    }
}
