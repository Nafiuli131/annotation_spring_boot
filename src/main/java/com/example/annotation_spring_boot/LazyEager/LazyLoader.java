package com.example.annotation_spring_boot.LazyEager;

import org.springframework.stereotype.Component;

@org.springframework.context.annotation.Lazy
@Component
public class LazyLoader {
    public LazyLoader(){
        System.out.println("lazy loading");
    }
}
