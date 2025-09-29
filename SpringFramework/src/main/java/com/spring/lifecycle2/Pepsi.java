package com.spring.lifecycle2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi() {
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {

        // this method will works as Init method.
        System.out.println("Taking Pepsi: init");
    }



    @Override
    public void destroy() throws Exception {
        // this method will works as Destroy method
        System.out.println("Going to give bottle Bake to the Shop: destroy");
    }


}
