package com.example.demo.aop;


import com.example.demo.annotation.ReqLog;
import com.example.demo.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author QianWei.Song
 * 切面实现自定义注解的日志记录
 * @Date: 2021/12/2 14:13
 * @Version 1.0
 */
@Aspect
@Slf4j
@Component
public class ReqLogAop {
    @Resource
    SysUserService userService;

    //定义切点
    @Pointcut("execution(public * com.example.demo.controller..*.*(..))")
    public void controllerAspect() {
    }


    //前置通知
    @Before("controllerAspect()")
    public void before() {
        System.out.println("@Before 打印方法信息前执行");
    }

    //    环绕通知
    // @Transactional(rollbackFor = Exception.class)
    @Around("controllerAspect() && @annotation(requestLog)")
    public Object doing(ProceedingJoinPoint joinPoint, ReqLog requestLog) throws Throwable {
        System.out.println("@Around环绕开始");
        //解析注解
        printMsg(joinPoint, requestLog);
//        try {
        //执行目标方法
        Object result = joinPoint.proceed();
        int a=1/0;
//        SysUser sysUser = new SysUser();
//        sysUser.setId(49);
//        userService.updateByid(sysUser);

        System.out.println("@Around环绕结束");
        return result;
  /*      } catch (Throwable throwable) {
            throw new RuntimeException(throwable.getMessage());
        }*/

    }

    @After("controllerAspect()")
    public void after() {
        System.out.println("@After 打印方法信息后执行");
    }

    private void printMsg(ProceedingJoinPoint joinPoint, ReqLog requestLog) {
        String action = requestLog.action();
        System.out.println(action);
        Class target = joinPoint.getTarget().getClass();
        String className = target.getName();
        System.out.println(className);
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                Object arg = args[i];
                System.out.println(arg);
            }
        }
        //判断方法体是否被记录日志得注解标注
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        //获取类对象
        Class<?> declaringClass = method.getDeclaringClass();
        Annotation[] annotations = declaringClass.getAnnotations();


        ReqLog annotation = method.getAnnotation(ReqLog.class);


        System.out.println("注解" + annotation.action());
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName);
    }


}
