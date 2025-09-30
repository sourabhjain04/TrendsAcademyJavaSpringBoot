package com.spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/spring/AOP/config.xml");

        PaymentService paymentObject = context.getBean("payment", PaymentService.class);
        paymentObject.makePayment();
    }
}
