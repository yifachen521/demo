package com.example.demo;

import com.example.demo.recycledependencis.A;
import com.example.demo.recycledependencis.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//开启异步注解
@EnableAsync
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        A a =(A) run.getBean("a");
        B b =(B) run.getBean("b");
        System.out.println(a.toString());
        System.out.println(b.toString());
    }



}
