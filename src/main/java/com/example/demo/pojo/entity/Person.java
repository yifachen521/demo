package com.example.demo.pojo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author QianWei.Song
 * @Date: 2021/11/30 15:17
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private Integer age;
    private Double price;
    private String address;
    private String wife;
    private String father;
    private String mather;
}
