package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.convert.ComputerDTO;
import com.example.demo.mapper.ComputerMapper;
import com.example.demo.pojo.entity.Computer;
import com.example.demo.service.IComputerService;
import org.springframework.stereotype.Service;
/**
 *  服务实现类
 *
 * @author idleFish
 * @since 2022-04-28
 * @copyright Copyright© 杭州聚能视界科技有限公司
 */
@Service
public class ComputerServiceImpl extends ServiceImpl<ComputerMapper, Computer> implements IComputerService {

    @Override
    public void createComputer(Computer computer) {
        this.save(computer);
    }

    @Override
    public ComputerDTO getComputerTotalPrice(Integer num) {

        return null;
    }


}
