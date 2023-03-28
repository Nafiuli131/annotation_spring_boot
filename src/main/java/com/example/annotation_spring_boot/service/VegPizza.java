package com.example.annotation_spring_boot.service;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "veg pizza";
    }
}
