package com.example.demo;

import com.example.demo.controller.TestController;
import com.example.demo.convert.ComputerToComputerConvert;
import com.example.demo.convert.ComputerDTO;
import com.example.demo.pojo.entity.BusReport;
import com.example.demo.pojo.entity.Computer;
import com.example.demo.pojo.entity.SysUser;
import com.example.demo.pojo.entity.TestHandlerEvent;
import com.example.demo.service.IComputerService;
import com.example.demo.service.TestService;
import com.example.demo.testTypehandlerByEnum.TestEnumSecend;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.function.Consumer;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    TestService testService;


    //mybatis xml文件的方式
    @Test
    void contextLoadsList() {
        BusReport list = testService.getList();
        System.out.println(list);
    }

    //mybatis  注解得sql方式
    @Test
    void getListSecend() {
        BusReport list = testService.getListSecend();
        System.out.println(list);
    }

    @Test
    void contextLoadsObj() {
        BusReport list = testService.getObj();
        System.out.println(list);
    }

    @Test
    void testEnumTypeHandler() {
        SysUser sysUser = new SysUser();
        sysUser.setName("wggppp");
        sysUser.setPassword("999");
        sysUser.setSex(TestEnumSecend.WOMAN.getSex());
        testService.insertUserInfo(sysUser);
        SysUser user = testService.getUser(35);
        // System.out.println(user);

    }

    //aop 验证是否在spring容器启动时创建的代理对象
    @Resource
    TestController testController;

    @Resource
    ApplicationContext appioc;

    @Resource
    WebApplicationContext applicationContext;

    @Test
    void checkAopBeanType() throws Exception {
        String args = "555";
        System.out.println(Thread.currentThread().getName() + "----");
        appioc.publishEvent(new TestHandlerEvent(this, args));
        System.out.println("success");


    }

    @Resource
    IComputerService computerService;

    @Test
    void createComputer() throws Exception {
        Computer computer = new Computer();
        computer.setDescription("纸巾");
        computer.setPrice(BigDecimal.valueOf(2.00));
        computer.setRemark("纸巾");

        computerService.createComputer(computer);


    }

    @Resource
    ComputerToComputerConvert computerToComputerConvert;

    @Test
    void testConvert() throws Exception {
        Computer computer = new Computer();
        computer.setDescription("描述");
        computer.setPrice(BigDecimal.valueOf(20));
        computer.setRemark("憋住");
        computer.setNum("3");
        //调用方法  处理结果
        ComputerDTO computerDTO = computerToComputerConvert.computerToComputerDTO(computer);
        System.out.println(computerDTO);
    }


    public static void method(String s, Consumer<String> con1,Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);

        //先执行con1 再执行 con2
        con2.andThen(con1).accept(s);
    }

    public static void main(String[] args) {
        method("Hello",(t)->{
            //消费方式：把字符串转换为大写输出
            System.out.println(t.toUpperCase()); 	//HELLO
        }, (t)->{
            //消费方式，把字符串转换为小写输出
            System.out.println(t.toLowerCase());	//hello
        });
    }


    @Test
    void testSpringSourceAbout() throws Exception {

    }


}
