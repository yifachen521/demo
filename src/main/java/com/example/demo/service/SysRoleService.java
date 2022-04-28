package com.example.demo.service;


import com.example.demo.mapper.SysRoleMapper;
import com.example.demo.pojo.SysRole;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/1/13 16:44
 * @Version 1.1.0
 */
@Service
public class SysRoleService implements InitializingBean {

    @Autowired
    private SysRoleMapper roleMapper;

    //两种初始化后调用方法的方式   实现接口InitializingBean 或 @PostConstruct
    @PostConstruct
    private void init(){
        System.out.println("SysRoleService初始化方法执行--------是在 applyBeanPostProcessorsBeforeInitialization 中执行-----");
    }


    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SysRoleService初始化方法执行--------是在 invokeInitMethods 中执行-----");
    }
}

