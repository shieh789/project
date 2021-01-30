package com.example.brand.response;

import com.example.common.ResultCode;
import lombok.ToString;

@ToString
public enum BrandCode implements ResultCode {
    Brand_ERROR_FAILSEPASSEORD(false,200000,"用户名不存在或密码错误！"),
    Brand_ERROR_FAILSEVALIDCODE(false,200001,"验证码错误！");

    //操作代码
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;
    private BrandCode(boolean success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}