package com.example.demo;

import com.example.demo.mapper.TestMapper;
import com.example.demo.pojo.SysUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        for (String beanDefinitionName : run.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        TestMapper testMapper = (TestMapper)run.getBean("testMapper");
        SysUser user = testMapper.getUser(1);
        System.out.println(user+"=====================");
    }

}
