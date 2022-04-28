package com.example.demo.service;


import com.example.demo.mapper.SysUserRoleMapper;
import com.example.demo.pojo.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/1/13 16:44
 * @Version 1.1.0
 */
@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}

