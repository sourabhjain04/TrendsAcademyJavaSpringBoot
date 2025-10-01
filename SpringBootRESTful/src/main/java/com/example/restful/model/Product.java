package com.example.restful.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Product {

    private int id;
    @NotBlank private String pname;
    @NotBlank private String batchno;
    @Min(0) private double price;
    @Min(0) private int noofproduct;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotBlank String getPname() {
        return pname;
    }

    public void setPname(@NotBlank String pname) {
        this.pname = pname;
    }

    public @NotBlank String getBatchno() {
        return batchno;
    }

    public void setBatchno(@NotBlank String batchno) {
        this.batchno = batchno;
    }

    @Min(0)
    public double getPrice() {
        return price;
    }

    public void setPrice(@Min(0) double price) {
        this.price = price;
    }

    @Min(0)
    public int getNoofproduct() {
        return noofproduct;
    }

    public void setNoofproduct(@Min(0) int noofproduct) {
        this.noofproduct = noofproduct;
    }

    public Product(int id, String pname, String batchno, double price, int noofproduct) {
        this.id = id;
        this.pname = pname;
        this.batchno = batchno;
        this.price = price;
        this.noofproduct = noofproduct;
    }

    public Product() {
        
    }


}
