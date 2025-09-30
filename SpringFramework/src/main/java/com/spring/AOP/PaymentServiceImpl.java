package com.spring.AOP;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void makePayment() {

        System.out.println("Amount Debited");


        System.out.println("Amount Credited");
    }


    public void updatedUser(String username, int age){
        System.out.println("user is updated");
    }
}
