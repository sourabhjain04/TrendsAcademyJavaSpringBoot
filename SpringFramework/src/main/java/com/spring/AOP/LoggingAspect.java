package com.spring.AOP;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Pointcut("execution(* com.spring.AOP.PaymentServiceImpl.updatedUser(..))")
    public void updateUser() {

    }
    @Before("updateUser() && args(username, age)")
    public void logBeforeUpdate(String username, int age) {
        System.out.println("updating User:" + username +"age:"+ age);
    }


}
