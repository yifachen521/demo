package com.example.demo.controller;


import com.example.demo.annotation.ReqLog;
import com.example.demo.pojo.SysUser;
import com.example.demo.service.SysUserService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author QianWei.Song
 * @Date: 2021/11/16 17:06
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
   // private TestService testService;

    @Resource
    SysUserService userService;
    @GetMapping("/one")
    @Transactional
    @ReqLog
    public void testOne() {
        //int b=1/0;
//        SysUser sysUser2 = new SysUser();
//
//        SysUser sysUser1 = new SysUser();
//        sysUser1.setId(49);
//        userService.updateByid(sysUser1);

       // int a=1/0;
        SysUser sysUser = new SysUser();
        sysUser.setId(48);
        userService.updateByname(sysUser);


    }



}
