package com.example.demo.pojo.entity;


import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/4/18 14:58
 * @Version 1.1.0
 */
@Getter
public class TestHandlerEvent extends ApplicationEvent {
    private String filed;

    public TestHandlerEvent(Object source,String filed) {
        super(source);
        this.filed=filed;

    }
}
