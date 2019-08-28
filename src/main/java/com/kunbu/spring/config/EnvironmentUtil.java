package com.kunbu.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @project: spring-practice
 * @author: kunbu
 * @create: 2019-08-28 14:05
 **/
@Component
public class EnvironmentUtil {

    @Autowired
    private Environment environment;

    public String getValue(String key, String defaultValue) {
        return environment.getProperty(key, defaultValue);
    }

}
