package com.spring.lifecycle2;

import com.spring.lifecycle.Samosa;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext
                context = new FileSystemXmlApplicationContext("src/main/java/com/spring/lifecycle2/config.xml");
   Pepsi p2 = (Pepsi) context.getBean("p2");
    System.out.println(p2);
    context.registerShutdownHook();
    }
}
