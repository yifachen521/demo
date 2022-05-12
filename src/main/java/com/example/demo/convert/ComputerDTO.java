package com.example.demo.convert;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
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
    @NotBlank(message = "Dto 的remark 不能为空")
    private String remark;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 价格
     */
    private BigDecimal totalPrice;
}
