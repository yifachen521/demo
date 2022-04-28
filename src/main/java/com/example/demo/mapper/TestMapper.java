package com.example.demo.mapper;


import com.example.demo.pojo.BusReport;
import com.example.demo.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author QianWei.Song
 * @Date: 2021/11/16 17:08
 * @Version 1.0
 */
@Mapper
public interface TestMapper {


    BusReport getList();
    BusReport getObj();

    @Select("select * from sys_user where id=1")
    BusReport getListSecend();


    void insertUserInfo(@Param("user") SysUser user);

    SysUser getUser(@Param("id") Integer id);

}
