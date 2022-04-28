package com.example.demo.service.impl;


import com.example.demo.mapper.SysUserMapper;
import com.example.demo.pojo.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/1/13 16:43
 * @Version 1.1.0
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser selectById(Integer id) {
        return userMapper.selectById(id);
    }

    public SysUser selectByName(String name) {
        return userMapper.selectByName(name);
    }

    public void updateByid(SysUser sysUser) {
        //int a= 1/0;
         userMapper.updateById(sysUser);
    }

   // @Transactional
    public void updateByname(SysUser sysUser) {
        //int a= 1/0;
        userMapper.updateByname(sysUser);
    }
}

