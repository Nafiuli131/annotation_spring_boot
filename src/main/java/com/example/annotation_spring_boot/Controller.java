package com.example.annotation_spring_boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${pie}")
    String pie;

    //if no value is available on that property, then we have the opportunity to use default message
    @Value("${weight: weight is not available here}")
    String weight;

    @GetMapping("/pie")
    public String getPie(){
        return "the value of pie is = "+ pie;
    }

    @GetMapping("/weight")
    public String getWeight(){
        return "the value of weight is = "+weight;
    }
}
