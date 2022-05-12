package com.example.demo.recycledependencis;

import org.springframework.stereotype.Component;

@Component
public class B {

    private A a;

    /*public B( @Lazy A a) {
        this.a = a;
    }*/

    public void setA(A a) {
        this.a = a;
    }
}
