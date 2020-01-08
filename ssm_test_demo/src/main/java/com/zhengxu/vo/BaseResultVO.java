package com.zhengxu.vo;

import com.zhengxu.constant.ResponseConstant;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhengxu
 * @create 2019-06-18 18:11
 * @desc 通用返回对象
 */

@Data
public class BaseResultVO<T> implements Serializable {

    private static final long serialVersionUID = 6152146033256407907L;
    private String errorCode;    //状态码0
    private String errorMessage;  //消息
    private T data;          //返回数据
    //通用空成功返回
    public static final BaseResultVO COMMON_SUCCESS_RESULT = new BaseResultVO();
    //通用参数错误返回
    public static final BaseResultVO COMMON_WRONG_PARAM_RESULT = new BaseResultVO(ResponseConstant.OPERATION_WRONG_PARAM);

    public BaseResultVO() {
        this.errorCode = ResponseConstant.OPERATION_SUCCESS.getCode();
        this.errorMessage = ResponseConstant.OPERATION_SUCCESS.getMessage();
    }

    public BaseResultVO(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseResultVO(String errorCode, String errorMessage, T data) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    public BaseResultVO(T data) {
        this.data = data;
        this.errorCode = ResponseConstant.OPERATION_SUCCESS.getCode();
        this.errorMessage = ResponseConstant.OPERATION_SUCCESS.getMessage();
    }

    public BaseResultVO(ResponseConstant responseConstant) {
        this.errorCode = responseConstant.getCode();
        this.errorMessage = responseConstant.getMessage();
    }
}
