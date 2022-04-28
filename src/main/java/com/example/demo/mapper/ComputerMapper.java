package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.entity.Computer;
import org.apache.ibatis.annotations.Mapper;

/**
 *  Mapper 接口
 *
 * @author idleFish
 * @since 2022-04-28
 * @copyright Copyright© 杭州聚能视界科技有限公司
 */
@Mapper
public interface ComputerMapper extends BaseMapper<Computer> {

}
