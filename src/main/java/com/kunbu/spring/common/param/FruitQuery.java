package com.kunbu.spring.common.param;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: mybatis-test
 * @description: 查询实体
 * @author: kunbu
 * @create: 2019-07-19 18:04
 **/
@Data
@AllArgsConstructor
public class FruitQuery {

    private String type;
    private String category;
    private Long min;
    private Long max;
}
