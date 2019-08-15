package com.kunbu.spring.service;

/**
 * @author: KunBu
 * @time: 2019/7/19 10:07
 * @description:
 */
public interface MyBatisService {

    void testParamWithAnnotation();

    void testParamNoAnnotation();

    void testParamByParamN();

    void testParamSingle();

    void testParamSingleList();

    void testParamQueryEntity();
}
