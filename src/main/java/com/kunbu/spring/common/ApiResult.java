package com.kunbu.spring.common;

import com.kunbu.spring.error.ApiError;
import com.kunbu.spring.error.CommonError;

import java.io.Serializable;

/**
 * @program: spring-practice
 * @description: API返回模型
 * @author: kunbu
 * @create: 2019-08-03 15:01
 **/
public class ApiResult implements Serializable {

    private boolean success;
    private Object data;
    private String errorCode;
    private String errorMsg;

    private ApiResult() {
    }

    public static ApiResult success() {
        ApiResult result = new ApiResult();
        result.setSuccess(true);
        return result;
    }

    public static ApiResult success(Object data) {
        ApiResult result = new ApiResult();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static ApiResult failure() {
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        return result;
    }

    public static ApiResult error(String errorCode, String errorMsg) {
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setErrorMsg(errorMsg);
        return result;
    }

    public static ApiResult error(ApiError apiError) {
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        result.setErrorCode(apiError.getErrorCode());
        result.setErrorMsg(apiError.getErrorMsg());
        return result;
    }

    public static ApiResult SYSTEM_BUSY() {
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        result.setErrorCode(CommonError.SYSTEM_BUSY.getErrorCode());
        result.setErrorMsg(CommonError.SYSTEM_BUSY.getErrorMsg());
        return result;
    }

    public static ApiResult OPERATION_ILLEGAL() {
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        result.setErrorCode(CommonError.OPERATION_ILLEGAL.getErrorCode());
        result.setErrorMsg(CommonError.OPERATION_ILLEGAL.getErrorMsg());
        return result;
    }

    public static ApiResult PARAM_ILLEGAL() {
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        result.setErrorCode(CommonError.PARAM_ILLEGAL.getErrorCode());
        result.setErrorMsg(CommonError.PARAM_ILLEGAL.getErrorMsg());
        return result;
    }

    public static ApiResult TOKEN_EXPIRE() {
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        result.setErrorCode(CommonError.TOKEN_EXPIRE.getErrorCode());
        result.setErrorMsg(CommonError.TOKEN_EXPIRE.getErrorMsg());
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
