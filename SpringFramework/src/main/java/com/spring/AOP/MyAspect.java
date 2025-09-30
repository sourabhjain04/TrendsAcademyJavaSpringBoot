package com.spring.AOP;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* com.spring.AOP.PaymentServiceImpl.makePayment())")
    public void printBefore(){
        System.out.println("payment started");
    }

    @After("execution(* com.spring.AOP.PaymentServiceImpl.makePayment())")
    public void printAfter(){
        System.out.println("payment Done");
    }

}
