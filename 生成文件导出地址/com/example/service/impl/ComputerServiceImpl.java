package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Computer;
import com.example.mapper.ComputerMapper;
import com.example.service.IComputerService;
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

}
