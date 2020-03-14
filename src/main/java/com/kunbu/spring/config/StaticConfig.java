package com.kunbu.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @project: spring-practice
 * @author: kunbu
 * @create: 2020-03-13 09:29
 **/
@Component
public class StaticConfig {

    private StaticConfig() {}

    /**
     * 5.静态属性读取
     **/
    private static String staticField;

    @Value("${static.field:2333}")
    public void setStaticField(String staticField) {

        StaticConfig.staticField = staticField;
    }

    public static String getValue() {
        return staticField;
    }

}
