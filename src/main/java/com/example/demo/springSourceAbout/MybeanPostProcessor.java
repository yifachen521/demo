package com.example.demo.springSourceAbout;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
/**
 *   BeanPostProcessor后置处理器
 */
@Configuration
public class MybeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
      //  System.out.println("自定义的前置处理执行");
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(@Nullable Object bean, String beanName) {
       // System.out.println("自定义的后置处理执行-----");
        return bean;
    }
}
