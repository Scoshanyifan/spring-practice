package com.kunbu.spring.service.impl;

import com.kunbu.spring.common.entity.FruitEntity;
import com.kunbu.spring.common.param.FruitQuery;
import com.kunbu.spring.dao.FruitMapper;
import com.kunbu.spring.service.MyBatisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: mybatis-test
 * @description: mybatis
 * @author: kunbu
 * @create: 2019-07-19 10:07
 **/
@Service
public class MyBatisServiceImpl implements MyBatisService {

    private static Logger logger = LoggerFactory.getLogger(MyBatisServiceImpl.class);

    @Autowired
    private FruitMapper fruitMapper;

    @Override
    public void testParamWithAnnotation() {
        try {
            List<FruitEntity> fruits = fruitMapper.getByTypeBetweenPrice_annotation("apple", 1000L, 2000L);
            logger.info(">>> size:{}", fruits.size());
        } catch (Exception e) {
            logger.error(">>> 参数使用@param注解", e);
        }
    }

    @Override
    public void testParamNoAnnotation() {
        try {
            List<FruitEntity> fruits = fruitMapper.getByTypeBetweenPrice_noAnnotation("apple", 1000L, 2000L);
            logger.info(">>> size:{}", fruits.size());
        } catch (Exception e) {
            logger.error(">>> 参数不使用注解", e);
        }
    }

    @Override
    public void testParamByParamN() {
        try {
            List<FruitEntity> fruits = fruitMapper.getByTypeBetweenPrice_paramN("apple", 1000L, 2000L);
            logger.info(">>> size:{}", fruits.size());
        } catch (Exception e) {
            logger.error(">>> 参数名命使用paramN规则", e);
        }
    }

    @Override
    public void testParamSingle() {
        try {
            List<FruitEntity> fruits = fruitMapper.getByCategory_singleParam("橙");
            logger.info(">>> size:{}", fruits.size());
        } catch (Exception e) {
            logger.error(">>> 单个参数", e);
        }
    }

    @Override
    public void testParamSingleList() {
        try {
            List<FruitEntity> fruits = fruitMapper.getByTypes_singleParamList(null);
//            List<FruitEntity> fruits = fruitMapper.getByTypes_singleParamList(Lists.newArrayList("watermelon", "cherry"));
            logger.info(">>> size:{}", fruits.size());
        } catch (Exception e) {
            logger.error(">>> 单个参数是List.", e);
        }
    }

    @Override
    public void testParamQueryEntity() {
        try {
            List<FruitEntity> fruits = fruitMapper.getByQuery_singleParamEntity(new FruitQuery("apple", "蛇果", null, null));
            logger.info(">>> size:{}", fruits.size());
        } catch (Exception e) {
            logger.error(">>> 单个参数是查询实体.", e);
        }
    }
}
