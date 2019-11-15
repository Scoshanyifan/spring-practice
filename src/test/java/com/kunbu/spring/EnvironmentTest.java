package com.kunbu.spring;

import com.kunbu.spring.controller.test.PropertyController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: spring-practice
 * @description:
 * @author: kunbu
 * @create: 2019-08-28 09:46
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class EnvironmentTest {

    @Autowired
    private PropertyController propertyController;

    @Test
    public void test() {
        System.out.println("junit success");
        propertyController.getProperty("server.port");
    }

}
