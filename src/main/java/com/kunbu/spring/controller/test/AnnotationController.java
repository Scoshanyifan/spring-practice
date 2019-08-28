package com.kunbu.spring.controller.test;

import com.kunbu.spring.annotation.ApiNote;
import com.kunbu.spring.common.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试注解说明
 * @program: spring-practice
 * @author: kunbu
 * @create: 2019-08-03 14:57
 **/
@RestController
@RequestMapping("/api")
public class AnnotationController {

    private static final Logger logger = LoggerFactory.getLogger(AnnotationController.class);

    @GetMapping("/note")
    @ApiNote("测试注解功能")
    public ApiResult apiAnnotationTest(@RequestParam Integer status, @RequestParam String key) {

        try {
            Integer i = Integer.parseInt(key);
        } catch (Exception e) {
            logger.error(">>> test error", e);
        }
        return ApiResult.success("test");
    }


}
