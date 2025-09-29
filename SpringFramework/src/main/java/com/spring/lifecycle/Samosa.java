package com.spring.lifecycle;

public class Samosa {
    private double price;

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        System.out.println("Setting the Price");
        this.price = price;

    }
    public Samosa() {

    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside the Init Method ");
    }

    public void destroy(){
        System.out.println("Inside the Destroy method ");
    }
}
