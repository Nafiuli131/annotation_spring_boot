package com.example.annotation_spring_boot.service;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "non veg pizza";
    }
}
