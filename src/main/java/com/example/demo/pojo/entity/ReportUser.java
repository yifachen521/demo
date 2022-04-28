package com.example.demo.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 报名用户信息
 *
 * @Author: lijinshuai
 * @Date: 2021/11/2
 */
@Data
public class ReportUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer sex;

    private String idCard;

}
