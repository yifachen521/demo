package com.example.demo.handler;


import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/3/9 16:52
 * @Version 1.1.0
 */
@Component
public class CorsFilterChild extends CorsFilter {

    public CorsFilterChild(CorsConfigurationSource configSource) {
        super(configSource);
    }
}
