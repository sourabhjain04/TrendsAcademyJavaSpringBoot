package com.spring.auto.wire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    @Autowired
    @Qualifier("address1")
    private Address address;
    // generate getter and setter and generate toSting method
    //defaut constructor and parameterized constructor.

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("By Setter");
        this.address = address;
    }

    public Emp() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Emp(Address address) {
        System.out.println("By Constructor");
      //  super();
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp [address=" + address + "]";
    }

}

