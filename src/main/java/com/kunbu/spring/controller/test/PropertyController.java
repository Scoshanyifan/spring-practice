package com.kunbu.spring.controller.test;

import com.kunbu.spring.common.ApiResult;
import com.kunbu.spring.config.EnvironmentUtil;
import com.kunbu.spring.config.PropertiesBean;
import com.kunbu.spring.config.PropertiesUtil;
import com.kunbu.spring.config.YmlBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取配置文件的方式
 *
 * @author kunbu
 * @time 2019/8/28 10:15
 * @return
 **/
@RestController
@RequestMapping("/env")
public class PropertyController {

    private static final Logger logger = LoggerFactory.getLogger(PropertyController.class);

    /**
     * 1.Environment读取
     **/
    @Autowired
    @Deprecated
    private EnvironmentUtil environmentUtil;

    /**
     * 2.properties映射
     **/
    @Autowired
    private PropertiesBean propertiesBean;

    /**
     * 3.yml映射
     **/
    @Autowired
    private YmlBean ymlBean;

    /**
     * 4.单个读取
     **/
    @Value("${logging.config:classpath:2333}")
    private String serverPort;

    /**
     * 5.静态属性读取
     **/
    private static String staticField;

    @Value("${static.field:2333}")
    public void setStaticField(String staticField) {
        PropertyController.staticField = staticField;
    }

    @GetMapping("/prop")
    public ApiResult getProperty(@RequestParam(required = false) String key) {
        /**
         * 6.通过类加载来读取properties
         **/
        logger.info(">>> property util:{}", PropertiesUtil.getValue("user.id"));

//        logger.info(">>> environment, key:[{}], value:[{}]", key, environmentUtil.getValue(key, key));

        logger.info(">>> properties, id:{}, name:{}", propertiesBean.getId(), propertiesBean.getName());
        logger.info(">>> yml, port:{}", ymlBean.getPort());
        logger.info(">>> @Value:{}", serverPort);
        logger.info(">>> staticField:{}", staticField);

        return ApiResult.success();
    }

}
