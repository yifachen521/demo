package com.example.demo.kafka;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/4/7 16:42
 * @Version 1.1.0
 */
@RestController
@RequestMapping("kafka")
public class KafkaProducer {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("send")
    public String send(String msg){
        kafkaTemplate.send("test_topic", msg);
        return "success";
    }



}
