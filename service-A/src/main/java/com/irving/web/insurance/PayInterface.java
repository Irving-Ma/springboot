package com.irving.web.insurance;

import java.util.Map;

/**
 * @program: com.irving.web.insurance
 * @author: Ma Xiangxiang
 * @create: 2020-04-23 17:27:30
 * @description: 支付相关操作
 */
public interface PayInterface {

    /**
     * 请求支付
     * @param para
     * @return
     */
    Map<String,Object> requestPay(Map<String,Object> para);
}
