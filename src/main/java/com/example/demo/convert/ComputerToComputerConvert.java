package com.example.demo.convert;

import com.example.demo.pojo.entity.Computer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
/**
 * 1. 引入依赖
 * 2. 编写本配置文件

 */
//需指定生成的映射器是一个 Spring bean，可以通过@Autowired检索
@Mapper(componentModel= MappingConstants.ComponentModel.SPRING)
public interface ComputerToComputerConvert {

    @Mapping(target = "id" ,ignore = true)
    @Mapping(target = "desc" ,source = "description")
    ComputerDTO computerToComputerDTO(Computer computer);

}
