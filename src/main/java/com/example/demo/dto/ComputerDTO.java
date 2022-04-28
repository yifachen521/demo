package com.example.demo.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName(resultMap = "computerDTOResultMap")
public class ComputerDTO {
    /**
     * 主键
     */
    private Long id;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 描述
     */
    private String desc;
    /**
     * 备注
     */
    private String remark;

    /**
     * 价格
     */
    private BigDecimal totalPrice;
}
