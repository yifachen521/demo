package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.dto.ComputerDTO;
import com.example.demo.pojo.entity.Computer;

/**
 *  服务类
 *
 * @author idleFish
 * @since 2022-04-28
 * @copyright Copyright© 杭州聚能视界科技有限公司
 */
public interface IComputerService extends IService<Computer> {

     void createComputer(Computer computer);

    ComputerDTO getComputerTotalPrice(Integer num);
}
