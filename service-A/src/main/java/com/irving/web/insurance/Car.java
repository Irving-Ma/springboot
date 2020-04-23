package com.irving.web.insurance;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: com.irving.web.insurance
 * @author: Ma Xiangxiang
 * @create: 2020-04-23 17:23:37
 * @description: 车辆相关信息查询
 */
public class Car implements CarInterface{

    private static Car instance;

    private Car(){

    }
    public static Car getInstance(){
        if(instance==null){
            instance = new Car();
        }
        return instance;
    }

    /**
     * 新车备案
     *
     * @param para
     * @return
     */
    @Override
    public Map<String, Object> NewCarFiling(Map<String, Object> para) {
        System.out.println("新车备案");
        Map<String,Object> map = new HashMap<>(4);
        map.put("code","200");
        map.put("message","新车备案");
        return map;
    }
}
