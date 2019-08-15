package com.kunbu.spring.common;

import com.kunbu.spring.common.entity.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: spring-practice
 * @description: API日志
 * @author: kunbu
 * @create: 2019-08-03 15:40
 **/
public class ApiLog extends BaseEntity implements Serializable {

    private String className;
    private String methodName;
    private String parameterJson;
    private String description;

    private String httpMethod;
    private String httpStatus;
    private String ip;
    private String url;
    private String token;
    private String userId;
    private String userAgent;

    private Long costTime;
    private Date createTime;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getParameterJson() {
        return parameterJson;
    }

    public void setParameterJson(String parameterJson) {
        this.parameterJson = parameterJson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getCostTime() {
        return costTime;
    }

    public void setCostTime(Long costTime) {
        this.costTime = costTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public String toString() {
        return "ApiLog{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", parameterJson='" + parameterJson + '\'' +
                ", description='" + description + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                ", ip='" + ip + '\'' +
                ", url='" + url + '\'' +
                ", token='" + token + '\'' +
                ", userId='" + userId + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", costTime=" + costTime +
                ", createTime=" + createTime +
                '}';
    }
}
