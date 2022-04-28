package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.jn.annotation.Excel;

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
  @TableId(value = "id", type = IdType.AUTO)
  @Excel(name = "主键")
  private Long id;
    /**
     * 价格
     */
  @Excel(name = "价格")
  private BigDecimal price;
    /**
     * 描述
     */
  @Excel(name = "描述")
  private String desc;
    /**
     * 备注
     */
  @Excel(name = "备注")
  private String remark;


}
