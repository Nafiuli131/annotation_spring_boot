package com.example.annotation_spring_boot.service;

import org.springframework.stereotype.Component;

//without component annotation other class don't find this class. so add annotation for finding this class from other class
@Component
public class Service {

    public String message(){
        return "get the message";
    }
}
