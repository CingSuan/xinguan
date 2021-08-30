package com.jinlin.exception;
/**
 * 只有运行时异常我们才是可以捕获的
 */

import com.jinlin.response.ResultCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author NieChangan
 */ 
@Data
@AllArgsConstructor
@NoArgsConstructor
//只有运行是异常才能处理
public class BusinessException extends RuntimeException {

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "错误信息")
    private String errMsg;

    public BusinessException(ResultCode r){
        this.code = r.getCode();
        this.errMsg = r.getMessage();
    }
}
