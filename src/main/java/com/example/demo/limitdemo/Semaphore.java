package com.example.demo.limitdemo;


import java.lang.annotation.*;
/**
 *
 * @author 炜哥哥
 * @date 2022/05/06 17:49
 * @param null
 * @return
 */
@Documented  //生成文档
@Inherited   //可以被子类使用
@Retention(RetentionPolicy.RUNTIME)   //运行时可以使用
@Target({ElementType.METHOD, ElementType.TYPE})  //目标元素
public @interface Semaphore {

}
