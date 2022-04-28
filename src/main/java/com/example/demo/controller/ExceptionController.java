package com.example.demo.controller;


import com.example.demo.exception.CustomizeException;
import com.example.demo.mapper.SysRoleMapper;
import com.example.demo.pojo.entity.SysUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author QianWei.Song  
 * @Date: 2021/12/21 10:32
 * @Version 1.0
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {
    @Resource
   private SysRoleMapper sysRoleMapper;
    @GetMapping("test")
    public  void testException(){
      //  AipClientConfiguration aipClientConfiguration = new AipClientConfiguration();
      //  aipClientConfiguration.getProxy();
        SysUser sysUser = new SysUser();

        throw  new CustomizeException();

    }

}
