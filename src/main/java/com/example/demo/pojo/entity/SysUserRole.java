package com.example.demo.pojo.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/1/13 16:41
 * @Version 1.1.0
 */
@Data
public class SysUserRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;

    // 省略getter/setter
}

