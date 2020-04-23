package com.irving.web.insurance;

import java.util.Map;

/**
 * @program: com.irving.web.insurance
 * @author: Ma Xiangxiang
 * @create: 2020-04-23 17:21:26
 * @description: 短信相关接口
 */
public interface MessageInterface {

    /**
     * 发送短信
     * @param para
     * @return
     */
    Map<String,Object> sendMessage(Map<String,Object> para);
}
