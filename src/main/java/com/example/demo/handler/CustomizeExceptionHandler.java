package com.example.demo.handler;


import com.example.demo.exception.CustomizeException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author QianWei.Song
 * @Date: 2021/12/21 10:44
 * @Version 1.0
 */
// @RestControllerAdvice 拦截处理controller类的抛出的异常
@RestControllerAdvice
public class CustomizeExceptionHandler {

    @ExceptionHandler(CustomizeException.class)
    public void handlerCustomizeException(){
        System.out.println("处理自定义的异常");
    }

}
