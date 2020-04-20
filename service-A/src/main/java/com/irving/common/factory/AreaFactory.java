package com.irving.common.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: com.irving.common.factory
 * @author: Ma Xiangxiang
 * @create: 2020-04-20 14:08:19
 * @description: 获取对应地区对象
 */
public class AreaFactory {

    /**
     * 地区工厂
     */
    public static Map<String,Area> areaMap = new HashMap<>();

    /**
     * 初始化工厂
     */
    static {
        areaMap.put("11",new BeijingArea());
        areaMap.put("33",new JiangsuArea());
        areaMap.put("61",new ShannxiArea());
        areaMap.put("12",new TianjinArea());
        areaMap.put("00",new OrdinaryArea());
    }

    /**
     * 获取地区对象
     * @param areaCode
     * @return
     */
    public static Area getAreaByCode(String areaCode){
        return areaMap.get(areaCode);
    }
}
