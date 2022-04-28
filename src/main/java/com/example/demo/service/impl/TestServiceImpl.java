package com.example.demo.service.impl;


import com.example.demo.mapper.TestMapper;
import com.example.demo.pojo.BusReport;
import com.example.demo.pojo.SongInfo;
import com.example.demo.pojo.SysUser;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author QianWei.Song
 * @Date: 2021/11/16 17:07
 * @Version 1.0
 */
@Service
public class TestServiceImpl implements TestService {


    @Autowired
    TestMapper testMapper;
    @Autowired
    SongInfo songInfo;


    @Override
    public BusReport getList() {
        return testMapper.getList();
    }

    @Override
    public BusReport getListSecend() {
        return testMapper.getListSecend();
    }
    @Override
    public BusReport getObj() {
        return testMapper.getObj();
    }



    @Override
    public void insertUserInfo(SysUser user) {
        System.out.println(Thread.currentThread().getId()+"-----1-------");
        testMapper.insertUserInfo(user);
    }

    @Override
    public SysUser getUser(Integer id) {
        System.out.println(Thread.currentThread().getId()+"-----2-------");
        return testMapper.getUser(id);
    }

}
