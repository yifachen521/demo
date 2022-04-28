package com.example.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/1/13 16:46
 * @Version 1.1.0
 */
@RestController
@Slf4j
public class TestSecurityController {

    @RequestMapping("/test")
    public String showLogin() {
        System.out.println("执行到次出");
        return "123l";
    }

    @RequestMapping("/admin")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String printAdmin() {
        return "如果你看见这句话，说明你有ROLE_ADMIN角色";
    }

    @RequestMapping("/user")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_USER')")
    public String printUser() {

        return "如果你看见这句话，说明你有ROLE_USER角色";
    }

}
