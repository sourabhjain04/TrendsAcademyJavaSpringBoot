package com.spring.lifecycle3;

import com.spring.lifecycle2.Pepsi;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext
                context = new FileSystemXmlApplicationContext("src/main/java/com/spring/lifecycle3/config.xml");
   Example example = (Example) context.getBean("example");
    System.out.println(example);
    context.registerShutdownHook();
    }
}
