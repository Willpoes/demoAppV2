package com.example.demoAppV2.domain;

import org.springframework.stereotype.Component;

@Component
public class Seller {
    private String name = "Julio";
    private String store = "Mi tienda S Boot";
    private Product product;

    public Seller(String name, String store, Product product) {
        this.name = name;
        this.store = store;
        this.product = product;
    }

    public Seller(String name, String store) {
        this.name = name;
        this.store = store;
    }
    //v2 onlyseller

    public Seller(){

    }

    public void showInfo(){
        //
        System.out.println("setter " + this.name + " store " + this.store);
        System.out.println("namer product " + this.product.getName() + "price " + this.product.getPrice() );
    }
    public void showInfo2(){
        //
        System.out.println("setter " + this.name + " store " + this.store);
    }
    public String showInfo3(){
        //
        String result = "setter " + this.name + " store " + this.store;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
