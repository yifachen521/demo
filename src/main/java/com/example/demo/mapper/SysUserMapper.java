package com.example.demo.mapper;


import com.example.demo.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/1/13 16:42
 * @Version 1.1.0
 */
@Mapper
public interface SysUserMapper {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser selectById(Integer id);

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser selectByName(String name);

    void updateById(@Param("sysUser") SysUser sysUser);

    void updateByname(@Param("sysUser")SysUser sysUser);
}

