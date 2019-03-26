package com.zhengxu.domain;

import lombok.Data;

import java.util.*;

@Data
public class Code {
    public static void main(String[] args) {
        List<Map> list = new ArrayList<>();
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name","keep");
        map.put("age",26);
        map.put("endType",1);
        map.put("status",6);
        Map<String, Object> map1 = new LinkedHashMap<>();
        map1.put("name","keep1");
        map1.put("age",261);
        map1.put("endType",2);
        map1.put("status",6);
        Map<String, Object> map2 = new LinkedHashMap<>();
        map2.put("name","keep1");
        map2.put("age",261);
        map2.put("endType",2);
        map2.put("status",5);
        Map<String, Object> map3 = new LinkedHashMap<>();
        map3.put("name","keep1");
        map3.put("age",261);
        map3.put("endType",2);
        map3.put("status",4);
        Map<String, Object> map4 = new LinkedHashMap<>();
        map4.put("name","keep1");
        map4.put("age",261);
        map4.put("endType",2);
        map4.put("status",3);
        Map<String, Object> map5 = new LinkedHashMap<>();
        map5.put("name","keep1");
        map5.put("age",261);
        map5.put("endType",2);
        map5.put("status",2);
        Map<String, Object> map6 = new LinkedHashMap<>();
        map6.put("name","keep1");
        map6.put("age",261);
        map6.put("endType",2);
        map6.put("status",1);
        list.add(map);
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        List<Map> list1 = new ArrayList<>();
        getTitles(list1);
       /* for (Map<String, Object> m:list) {
            if (m==null){
                return;
            }
            *//*for (Map.Entry<String, Object> me: m.entrySet()) {
                if (me.getKey()=="sex" && me.getValue().equals(1)){
                    m.put(me.getKey(),"男");
                    m.remove("age");
                }
            }*//*
            if(m.get())
        }*/
        System.out.println(list);
    }

    public static void getTitles(List<Map> mapList) {
        List<String> titles = new ArrayList<>();
        boolean flag = true;
        for (Map<String, Object> map : mapList) {
            if (map == null) {
                return ;
            }
            if(map.get("endType").equals(1) && map.get("status").equals(6)){
                map.put("status","项目完成");
                map.remove("endType");
            }else if(map.get("endType").equals(2) && map.get("status").equals(6)){
                map.put("status","项目结束");
                map.remove("endType");
            }else if (map.get("status").equals(5)){
                map.put("status","复购超时");
                map.remove("endType");
            }else if (map.get("status").equals(4)){
                map.put("status","已复购");
                map.remove("endType");
            }else if (map.get("status").equals(3)){
                map.put("status","待复购");
                map.remove("endType");
            }else if (map.get("status").equals(2)){
                map.put("status","首次购买");
                map.remove("endType");
            }else if (map.get("status").equals(1)){
                map.put("status","加入未购买");
                map.remove("endType");
            }


         }
    }
}
