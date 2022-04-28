package com.example.demo.mapper;


import com.example.demo.pojo.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/1/13 16:42
 * @Version 1.1.0
 */
@Mapper
public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(Integer id);
}
