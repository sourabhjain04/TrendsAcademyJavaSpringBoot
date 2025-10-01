package com.example.jpa;

import com.example.jpa.dao.UserRepository;
import com.example.jpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpa1Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringJpa1Application.class);

        UserRepository userRepository = context.getBean(UserRepository.class);
        User user = new User();
        user.setName("Jack");
        user.setCity("Indore");
        user.setStatus("I am from java spring boot");

        User user1 = userRepository.save(user);
        System.out.println(user1);

    }



}
