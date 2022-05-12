package com.example.demo.limitdemo;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 *    接口限流的拦截器
 * @author 炜哥哥
 * @date 2022/05/06 17:51
 */
@Component
public class PassportInterceptor implements HandlerInterceptor {

/*    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (handler instanceof HandlerMethod) {//仅针对方法
            RequestLimitConfig config = SpringUtils.getBean(RequestLimitConfig.class);//自定义配置类 封装限流相关属性
            HandlerMethod methodHandler = (HandlerMethod) handler;
            Method method = methodHandler.getMethod();
            //匹配用到了该注解的方法或者类
            Semaphore nm = method.getAnnotation(Semaphore.class);
            Semaphore nc = method.getDeclaringClass().getAnnotation(Semaphore.class);
            // 是否开启拦截  配置文件中定义 是否开启拦截
            if (!config.getSwitchs()) {
                return true;
            }
            String uri = getUri();
            if (nm == null && nc == null) {
                return true;
            }

            // IP级别限流
            Integer qps = config.getQps();
            boolean check = SemaphoreUtil.check(CommonUtils.getIpAddress(), uri, qps);
            if (!check) {
                response.setStatus(ResultCode.REQUEST_TOO_FREQUENT.getCode());
                return false;
            }

            // URL级别限流
            qps = config.getAllqps();
            check = SemaphoreUtil.check(uri, qps);
            if (!check) {
                response.setStatus(ResultCode.REQUEST_TOO_FREQUENT.getCode());
                return false;
            }


        }
        return true;
    }

    private String getUri() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        String uri = request.getRequestURI();
        if (uri.startsWith("/")) {
            uri = uri.substring(1, uri.length());
        }
        return uri.replaceAll("/", ".");
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        LOGGER.info("调用postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        LOGGER.info("调用afterCompletion");
    }*/
}
