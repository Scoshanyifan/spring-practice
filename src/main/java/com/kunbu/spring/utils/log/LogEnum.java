package com.kunbu.spring.utils.log;

/**
 * @author: KunBu
 * @time: 2019/8/7 11:02
 * @description:
 */
public enum LogEnum {

    //
    EXECUTOR("Executor"),
    METHOD_CONSUME("Method-consume"),


    ;

    private String name;

    private LogEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
