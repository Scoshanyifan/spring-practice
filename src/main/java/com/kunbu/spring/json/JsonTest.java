package com.kunbu.spring.json;

import com.alibaba.fastjson.JSONObject;
import com.kunbu.spring.common.dto.BaseOutsidePushDTO;
import com.kunbu.spring.common.dto.OutcheckPushDTO;

/**
 * @project: spring-practice
 * @author: kunbu
 * @create: 2019-08-30 10:23
 **/
public class JsonTest {

    public static void main(String[] args) {
        OutcheckPushDTO dto = new OutcheckPushDTO(
                "testOne",
                "001",
                "1a:3d:44",
                "80097652",
                "kunbu",
                "2019-08-30 10:27:12",
                "ext",
                "WIFI",
                "chair");
        pushRunnable(dto);
    }

    public static void pushRunnable(BaseOutsidePushDTO data) {
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(data);
        jsonObject.put("pushType", "lalala");

        JSONObject json = new JSONObject();
        json.put("data", jsonObject);
        System.out.println(">>> data: " + json);

        OutcheckPushDTO parse = JSONObject.parseObject(jsonObject.toJSONString(), OutcheckPushDTO.class);
        System.out.println(parse);
    }
}
