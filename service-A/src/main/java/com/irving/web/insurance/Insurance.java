package com.irving.web.insurance;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: com.irving.web.insurance
 * @author: Ma Xiangxiang
 * @create: 2020-04-23 17:32:28
 * @description: 新保主流程实现类
 */
public class Insurance implements InsuranceInterface {

    private static Insurance instance;

    private Insurance(){

    }
    public static Insurance getInstance(){
        if(instance==null){
            instance=new Insurance();
        }
        return instance;
    }

    /**
     * 车型查询
     *
     * @param para
     * @return
     */
    @Override
    public Map<String, Object> queryCarType(Map<String, Object> para) {
        System.out.println("车型查询");
        Map<String,Object> map = new HashMap<>(4);
        map.put("code","200");
        map.put("message","车型查询");
        return map;
    }

    /**
     * 保费计算
     *
     * @param para
     * @return
     */
    @Override
    public Map<String, Object> premiumCalculation(Map<String, Object> para) {
        System.out.println("保费计算");
        Map<String,Object> map = new HashMap<>(4);
        map.put("code","200");
        map.put("message","保费计算");
        return map;
    }

    /**
     * 核保
     *
     * @param para
     * @return
     */
    @Override
    public Map<String, Object> reviewInsurance(Map<String, Object> para) {
        System.out.println("核保");
        Map<String,Object> map = new HashMap<>(4);
        map.put("code","200");
        map.put("message","核保");
        return map;
    }
}
