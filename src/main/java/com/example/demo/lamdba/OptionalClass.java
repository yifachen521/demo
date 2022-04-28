package com.example.demo.lamdba;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author QianWei.Song
 * @Date: 2021/12/1 15:43
 * @Version 1.0
 */
public class OptionalClass {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(LocalDate.of(2020, 11, 30), LocalTime.now());
        LocalDateTime now = LocalDateTime.now();
        long l = Duration.between(of, now).toHours();
        System.out.println(l);
    }

}
