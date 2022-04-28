package com.example.demo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;
@Component
public class kafka {
   // @KafkaListener(topics = "heima")
    public void ceshi(String message){
        //获取数据，1.车辆名称，2.车辆时间，3.经度 4。纬度
        String[] messageSplit = message.split(",");
        //车辆名称
        String cheliangName = messageSplit[0];
        //车辆时间
        String cheliangDate = messageSplit[4];
        //车辆经度
        String cheliangX = messageSplit[5];
        //车辆纬度
        String cheliangY = messageSplit[6];
        if (cheliangX.contains(" ") || cheliangY.contains(" ")){
            System.out.println(message);
        }
    }

   // @KafkaListener(topics = "test_topic")
    public void cesh1(ConsumerRecord<?, ?> record){
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }
}
