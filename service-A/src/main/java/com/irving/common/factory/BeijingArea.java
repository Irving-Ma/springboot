package com.irving.common.factory;

import com.irving.web.insurance.Car;
import com.irving.web.insurance.Insurance;
import com.irving.web.insurance.Pay;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: com.irving.common.factory
 * @author: Ma Xiangxiang
 * @create: 2020-04-20 13:58:05
 * @description: 北京地区流程
 */
public class BeijingArea implements Area{

    /**
     * 执行北京地区流程方法
     */
    @Override
    public void excuteAreaProcess() {
        //车型查询
        Map<String,Object> temp0 = Car.getInstance().NewCarFiling(new HashMap<>());
        if(null != temp0 && !"".equals(temp0.get("message"))){
            Map<String,Object> temp1 = Insurance.getInstance().queryCarType(new HashMap<>());
            if(null != temp1 && !"".equals(temp1.get("message"))){
                //保费计算
                Map<String,Object> temp2 = Pay.getInstance().requestPay(new HashMap<>());
            }
        }
    }

    /**
     * 获取地区执行结果
     */
    @Override
    public String getAreaInfo() {
        return "执行北京地区流程成功";
    }
}
