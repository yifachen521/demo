package com.example.demo.handler;


import com.example.demo.comment.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Locale;

/**
 * @Author QianWei.Song
 * @Date: 2021/12/21 10:44
 * @Version 1.0
 */
// @RestControllerAdvice 拦截处理controller类的抛出的异常
@RestControllerAdvice
public class CustomizeExceptionHandler {

  /*  @ExceptionHandler(Exception.class)
    @ResponseBody
    public R<?> handlerCustomizeException(Exception e){
        return R.data("400",null,e.getLocalizedMessage());
    }*/


    @Autowired
    private MessageSource messageSource;
    Locale locale = LocaleContextHolder.getLocale();

    protected String getMsg(String key) {
        try {
            return messageSource.getMessage(key, null, locale);
        }catch(NoSuchMessageException e){
            return key;
        }
    }

    /**
     * 拦截所有@Validated注解，用于处理参数验证错误
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R<?> methodArgumentNotValid(HttpServletRequest req, MethodArgumentNotValidException  ex) {
        List<ObjectError> errors =ex.getBindingResult().getAllErrors();
        StringBuffer errorMsg=new StringBuffer();
        errors.stream().forEach(
                x -> errorMsg.append(getMsg(x.getDefaultMessage())).append(";")
        );
        return R.data("400",null,errorMsg.toString());
    }

}
