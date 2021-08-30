package com.jinlin.exception;


import com.jinlin.response.ResultCode;
import com.jinlin.response.Result;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    public Result handlerArithmeticException() {

        return Result.error(ResultCode.ARITHMETIC_EXCEPTION);
    }

}
