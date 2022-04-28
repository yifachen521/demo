package com.example.demo.pojo;


import lombok.Data;

import java.io.Serializable;

/**
 * @description
 * @Author QianWei.Song
 * @Date: 2022/1/13 16:41
 * @Version 1.1.0
 */
@Data
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

}

