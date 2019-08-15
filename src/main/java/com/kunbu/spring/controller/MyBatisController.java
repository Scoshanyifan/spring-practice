package com.kunbu.spring.controller;

import com.google.common.collect.Maps;
import com.kunbu.spring.service.MyBatisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: mybatis-test
 * @description:
 * @author: kunbu
 * @create: 2019-07-19 09:28
 **/
@RestController
@RequestMapping("/mybatis")
public class MyBatisController {

    private static final Logger logger = LoggerFactory.getLogger(MyBatisController.class);

    @Autowired
    private MyBatisService myBatisService;

    @GetMapping("/hello")
    public Map<String, Object> hello() {

        Map<String, Object> result = Maps.newHashMap();
        result.put("code", 1);
        result.put("data", "perfect");
        return result;
    }

    @GetMapping("/param")
    public Map<String, Object> param(/* @Param("p1")@RequestParam() String param1, Integer number, byte[] bs */) {

        //测试方法上的注解
//        Method[] ms = MyBatisController.class.getDeclaredMethods();
//        for (Method m : ms) {
//            Annotation[][] paramAnnotations = m.getParameterAnnotations();
//            logger.info(">>> param size:{}", paramAnnotations.length);
//            for (Annotation[] a : paramAnnotations) {
//                logger.info(">>> a[].size:{}", a.length);
//                for (Annotation anno : a) {
//                    logger.info(">>> anno:{}", anno.toString());
//                }
//            }
//        }

        myBatisService.testParamWithAnnotation();
        myBatisService.testParamNoAnnotation();
        myBatisService.testParamByParamN();
        myBatisService.testParamSingle();
        myBatisService.testParamSingleList();
        myBatisService.testParamQueryEntity();

        Map<String, Object> result = Maps.newHashMap();
        result.put("code", 1);
        result.put("data", "perfect");
        return result;
    }
}
