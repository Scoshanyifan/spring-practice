package com.kunbu.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @project: spring-practice
 * @author: kunbu
 * @create: 2019-08-28 10:18
 **/
@Component
@ConfigurationProperties(prefix = "user")
@PropertySource("classpath:prop.properties")
public class PropertiesBean {

    private String name;

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
