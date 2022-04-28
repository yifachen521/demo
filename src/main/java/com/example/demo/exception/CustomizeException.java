package com.example.demo.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author QianWei.Song
 * @Date: 2021/12/21 10:33
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomizeException extends RuntimeException{
    private Integer code;
    private String message;

}
