package com.irving.web.insurance;

import java.util.Map;

/**
 * @program: com.irving.web.insurance
 * @author: Ma Xiangxiang
 * @create: 2020-04-23 17:12:57
 * @description: 新保业务流程接口
 */
public interface InsuranceInterface {

    /**
     * 车型查询
     * @param para
     * @return
     */
    Map<String,Object> queryCarType(Map<String,Object> para);

    /**
     * 保费计算
     * @param para
     * @return
     */
    Map<String,Object> premiumCalculation(Map<String,Object> para);

    /**
     * 核保
     * @param para
     * @return
     */
    Map<String,Object> reviewInsurance(Map<String,Object> para);

}
