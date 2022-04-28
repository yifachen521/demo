package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;
import com.jn.common.Condition;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.jn.common.R;
import com.example.demo.entity.Computer;
import com.example.demo.pojo.dto.ComputerDTO;
import com.jn.utils.*;
import com.example.service.IComputerService;

/**
 *  控制器
 *
 * @author idleFish
 * @since 2022-04-28
 * @copyright Copyright© 杭州聚能视界科技有限公司
 */
@RestController
@AllArgsConstructor
@RequestMapping("computer")
@Api(tags = "相关接口")
public class ComputerController {

	private IComputerService computerService;

}
