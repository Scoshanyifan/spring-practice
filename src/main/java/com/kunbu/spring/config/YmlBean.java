package com.kunbu.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @project: spring-practice
 * @author: kunbu
 * @create: 2019-08-28 13:16
 **/
@Component
@ConfigurationProperties(prefix = "server")
public class YmlBean {

    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
