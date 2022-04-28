package com.example.demo.pojo;


import lombok.Data;

import java.io.Serializable;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/1/13 16:40
 * @Version 1.1.0
 */
@Data

public class SysUser implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;

    public String sex;


}
