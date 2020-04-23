package com.irving.web.insurance;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: com.irving.web.insurance
 * @author: Ma Xiangxiang
 * @create: 2020-04-23 17:35:07
 * @description: 支付相关实现类
 */
public class Pay implements PayInterface {

    private static Pay instance;

    private Pay(){

    }

    public static Pay getInstance(){
        if(instance==null){
            instance=new Pay();
        }
        return instance;
    }
    /**
     * 请求支付
     *
     * @param para
     * @return
     */
    @Override
    public Map<String, Object> requestPay(Map<String, Object> para) {
        System.out.println("请求支付");
        Map<String,Object> map = new HashMap<>(4);
        map.put("code","200");
        map.put("message","请求支付");
        return map;
    }
}
