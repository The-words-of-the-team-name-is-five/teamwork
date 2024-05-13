package com.team.em.config;

import com.team.em.common.R;
import com.team.em.exception.BizException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 拦截业务异常
     *
     * @param e 业务异常
     * @return R
     */
    @ResponseBody
    @ExceptionHandler(BizException.class)
    public R handle(BizException e) {
        return R.error(e.getCode(), e.getMessage());
    }

}
