package com.example.controller;

import com.example.service.IComputerService;
import com.jn.utils.*;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;

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
