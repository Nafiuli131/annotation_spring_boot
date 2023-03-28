package com.example.annotation_spring_boot;

import com.example.annotation_spring_boot.service.Pizza;
import com.example.annotation_spring_boot.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //three types of autowired --- 1.getter injection 2.setter injection 3.field injection
    //field injection
    @Autowired
    private Service service;

    //    if there are multiple beans of the same type,
    //    you may need to use the @Qualifier annotation to specify which bean to inject.
    @Autowired
    @Qualifier("vegPizza")
    private Pizza pizza;

    @Autowired
    @Qualifier("nonVegPizza")
    private Pizza pizza2;

    @Value("${pie}")
    String pie;

    //if no value is available on that property, then we have the opportunity to use default message
    @Value("${weight: weight is not available here}")
    String weight;

    @GetMapping("/pie")
    public String getPie() {
        return "the value of pie is = " + pie;
    }

    @GetMapping("/weight")
    public String getWeight() {
        return "the value of weight is = " + weight;
    }

    @GetMapping("/message")
    public String getMessage() {
        return service.message();
    }

    @GetMapping("/pizza")
    public String getPizzaMessage() {
        return pizza.getPizza();
    }

    @GetMapping("/pizza2")
    public String getPizzaMessage2() {
        return pizza2.getPizza();
    }
}
