package com.example.annotation_spring_boot.LazyEager;

import org.springframework.stereotype.Component;

//by default eager annotation is working
@Component
public class Eager {

    public Eager() {
        System.out.println("eagerly loading");
    }
}
