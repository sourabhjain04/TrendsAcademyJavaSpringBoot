package com.spring.lifecycle3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

    private String Subject;

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public Example() {
    }

    @Override
    public String toString() {
        return "Example{" +
                "Subject='" + Subject + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("start method");
    }

    @PreDestroy
    public void end(){
        System.out.println("end method");
    }
}
