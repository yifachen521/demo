package com.example.demo.recycledependencis;

import org.springframework.stereotype.Component;

/**
 *  ；总结：  spring解决了属性方式和set方式的循环循环依赖
 * @author 炜哥哥
 * @date 2022/05/12 14:03
 * @return
 */
@Component
public class A {

    private B b;
    //构造方式的循环依解决
    /*   public A(@Lazy B b) {
        this.b = b;
    }*/
    //set方式的循环依赖  spring自动解决 不用添加@lazy的方式处理 人家已经在 bean的创建阶段就处理掉了
    public void setB(B b) {
        this.b = b;
    }
}
