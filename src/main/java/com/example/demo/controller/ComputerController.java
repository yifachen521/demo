package com.example.demo.controller;

import com.example.demo.pojo.entity.Person;
import com.example.demo.service.IComputerService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  控制器
 *
 * @author idleFish
 * @since 2022-04-28
 * @copyright Copyright© 杭州聚能视界科技有限公司
 */
@RestController
@RequestMapping("computer")
public class ComputerController {
	@Resource
	private IComputerService computerService;

	@PostMapping("list")
	public void  list(@Validated @RequestBody Person computer){
		System.out.println("complete");
	}



}
