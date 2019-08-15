package com.kunbu.spring.utils.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: spring-practice
 * @description: 日志工厂
 * @author: kunbu
 * @create: 2019-08-07 10:57
 **/
public class LogFactory {

    public static Logger getExecutorLogger() {
        return LoggerFactory.getLogger(LogEnum.EXECUTOR.getName());
    }

    public static Logger getMethodConsumeLogger() {
        return LoggerFactory.getLogger(LogEnum.METHOD_CONSUME.getName());
    }
}
