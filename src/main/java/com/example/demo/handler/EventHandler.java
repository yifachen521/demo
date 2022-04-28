package com.example.demo.handler;


import com.example.demo.pojo.entity.TestHandlerEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/4/18 15:05
 * @Version 1.1.0
 */
@Component
public class EventHandler implements ApplicationListener<ApplicationStartedEvent> {

    //@Async
    //@EventListener
    public void testEvent(TestHandlerEvent testHandlerEvent){

    }

    @Override
    @Async
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println(Thread.currentThread().getName()+"------++--");
        System.out.println(event.getApplicationContext());
    }
}
