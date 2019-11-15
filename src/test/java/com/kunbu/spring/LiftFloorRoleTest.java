package com.kunbu.spring;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: spring-practice
 * @author: kunbu
 * @create: 2019-09-09 14:45
 **/
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class LiftFloorRoleTest {

    public static void main(String[] agrs) {
        System.out.println(convertFloor("H2，B1，2:12，-1:5.C8"));
    }

    private static List<String> convertFloor(String roleText) {
        //顺序保存
        List<String> floorNameList = new ArrayList<>();
        String[] items = roleText.split(",|，");

        for (String item : items) {
            //处理 1:5 / -3:-1 （错误：-1:3）
            if (item.indexOf(":") > 0 || item.indexOf("：") > 0) {
                String[] startEnd = item.split(":|：");
//                System.out.println(Arrays.toString(startEnd));
                if (startEnd.length != 2) {
                    throw new RuntimeException("组合楼层，参数缺失");
                }
                int start;
                int end;
                try {
                    start = Integer.parseInt(startEnd[0]);
                    end = Integer.parseInt(startEnd[1]);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("组合楼层，参数须为数字");
                }
                if (start == 0 || end == 0) {
                    throw new RuntimeException("组合楼层，不能出现0层");
                }
                if (start >= end) {
                    throw new RuntimeException("组合楼层，首尾层数有误");
                }
                if (start < 0 && end > 0) {
                    throw new RuntimeException("组合楼层，不能同时包含正负楼层");
                }
                for (int i = start; i < end + 1; i++) {
                    floorNameList.add(Integer.toString(i));
                }
                continue;
            }
            //普通item：B2 / F1 / 0
            floorNameList.add(item);
        }
        return floorNameList;
    }

}
