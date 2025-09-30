package com.example.aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger log= LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* com.example.aop.service..*(..))")
    public Object timeAndLog(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        try{
            Object result = pjp.proceed();
            long ms = System.currentTimeMillis() - startTime;
            log.info("Mothod{} took{} ms and returned:{}",pjp.getSignature(),ms,result);
            return result;
        }catch(Throwable ex){
            long ms = System.currentTimeMillis() - startTime;
            log.error("Method{} failed after{} ms:{}",pjp.getSignature(),ms,ex.toString());
            throw ex;
        }
    }



}
