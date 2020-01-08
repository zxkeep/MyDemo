package com.zhengxu.constant;

/**
 * @author zhengxu
 * @create 2019-06-18 18:11
 * @desc 返回参数常量
 */
public enum ResponseConstant {

    OPERATION_SUCCESS("0000", "操作成功"),
    OPERATION_FAIL("0001", "操作失败"),
    OPERATION_WRONG_CAPTCHA_CODE("0002", "验证码错误"),
    OPERATION_WRONG_PARAM("0003", "参数错误"),
    OPERATION_WITHOUT_LOGIN("0004", "尚未登录"),
    OPERATION_LOGIN_FAIL("0005", "用户名或密码错误！"),
    SYSTERM_EXCEPT("1000", "系统异常");

    private String code;
    private String message;

    ResponseConstant(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
