package com.spring.ci;

import com.spring.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
    System.out.println("Hello World");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/spring/ci/config.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);

    }
}
