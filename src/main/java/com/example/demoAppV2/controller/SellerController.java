package com.example.demoAppV2.controller;

import com.example.demoAppV2.domain.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//clase cmo componer? como restcontroller
@RequestMapping("/v1")
public class SellerController
{
    @Autowired
    private Seller seller;

    @GetMapping("/pedir")
    public String getSeller(){
        return seller.showInfo3();
    }

}
