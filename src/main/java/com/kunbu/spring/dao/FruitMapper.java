package com.kunbu.spring.dao;


import com.kunbu.spring.common.entity.FruitEntity;
import com.kunbu.spring.common.param.FruitQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FruitMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(FruitEntity record);

    int insertSelective(FruitEntity record);

    FruitEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FruitEntity record);

    int updateByPrimaryKey(FruitEntity record);

    List<FruitEntity> getByTypeBetweenPrice_annotation(@Param("type") String type, @Param("min") Long minPrice, @Param("max") Long maxPrice);

    /**
     * 不加@param注释会导致参数转换错误
     *
     * @param type
     * @param minPrice
     * @param maxPrice
     * @return
     * @author kunbu
     * @time 2019/7/19 17:38
     **/
    List<FruitEntity> getByTypeBetweenPrice_noAnnotation(String type, Long minPrice, Long maxPrice);

    /**
     * 如果不使用@param注解，使用源码中默认的paramN的形式也是可以的
     *
     * @param param1
     * @param param2
     * @param param3
     * @return
     * @author kunbu
     * @time 2019/7/19 15:36
     **/
    List<FruitEntity> getByTypeBetweenPrice_paramN(String param1, Long param2, Long param3);

    /**
     * 单个参数不需要@param注解
     *
     * @param category
     * @return
     * @author kunbu
     * @time 2019/7/19 17:39
     **/
    List<FruitEntity> getByCategory_singleParam(String category);

    /**
     * 单个参数是集合，且不是命名为list（会报错）
     *
     * @param types
     * @return
     * @author kunbu
     * @time 2019/7/19 17:39
     **/
    List<FruitEntity> getByTypes_singleParamList(List<String> types);

    /**
     * 使用查询实体作为容器
     *
     * @param query
     * @return
     * @author kunbu
     * @time 2019/7/19 18:05
     **/
    List<FruitEntity> getByQuery_singleParamEntity(FruitQuery query);
}