package com.example.demo.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 实体类
 *
 * @author idleFish
 * @since 2022-04-28
 * @copyright Copyright© 杭州聚能视界科技有限公司
 */
@Data
@TableName("computer")
public class Computer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
  @TableId(value = "id", type = IdType.ASSIGN_ID)
  private Long id;
    /**
     * 价格
     */
  private BigDecimal price;
    /**
     * 描述
     */
    @TableField(value = "`desc`")
  private String description;
    /**
     * 备注
     */
    @NotBlank(message = "remark 不为空")
  private String remark;
  /**
     * 数量
     */
  @NotBlank(message = "num 不为空")
  private String num;

//  @Valid
//  private List<ComputerDTO> computerDTO;


}
