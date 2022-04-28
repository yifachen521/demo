package com.example.demo.handler;


import com.example.demo.pojo.ReportUser;

/**
 * @Author QianWei.Song
 * @Date: 2021/11/17 14:45
 * @Version 1.0
 */
public class ReporUserArrayHandler extends ArrayJsonHandler<ReportUser>{

    public ReporUserArrayHandler() {
        super.clazz=ReportUser.class;
    }
}
