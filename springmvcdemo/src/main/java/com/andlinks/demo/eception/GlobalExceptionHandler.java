package com.andlinks.demo.eception;

import com.andlinks.demo.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 陈亚兰 on 2017/7/12.
 * 全局异常处理器
 */

/**
 * 标注完之后，该类就变成一个控制器通知处理器了，
 * 接着我们需要进行一些通知的处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log= LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultUtil defaultExceptionHandler(HttpServletRequest req, Exception e) throws Exception {
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
            throw e;

        String throwClassName = e.getStackTrace()[0].getClassName();
        log.error("GlobalExceptionHandler catch a Server Exception: ", e);

        // Otherwise setup and send the user to a default error-view.
        ResultUtil result=new ResultUtil();
        result.setInfo(e.toString());
        return result;
    }
}
