package com.example.aop.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name) {
        try{
            Thread.sleep(100);}
        catch(InterruptedException ignored){}

        return "Hello " + (name==null||name.isBlank()?"world":name)+"!";
    }

}
