package com.example.demo.service;


import com.example.demo.pojo.BusReport;
import com.example.demo.pojo.SysUser;

/**
 * @Author QianWei.Song
 * @Date: 2021/11/16 17:07
 * @Version 1.0
 */
public interface TestService  {
     BusReport getList();
     BusReport getListSecend();
     BusReport getObj();

     //测试mybatis枚举转换
     void insertUserInfo(SysUser user);

     SysUser getUser(Integer id);

}
