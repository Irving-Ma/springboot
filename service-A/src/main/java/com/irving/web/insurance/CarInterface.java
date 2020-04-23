package com.irving.web.insurance;

import java.util.Map;

/**
 * @program: com.irving.web.insurance
 * @author: Ma Xiangxiang
 * @create: 2020-04-23 17:23:37
 * @description: 车辆相关信息查询
 */
public interface CarInterface {

    /**
     * 新车备案
     * @param para
     * @return
     */
    Map<String,Object> NewCarFiling(Map<String,Object> para);

}
