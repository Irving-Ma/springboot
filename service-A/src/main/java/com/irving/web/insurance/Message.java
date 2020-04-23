package com.irving.web.insurance;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: com.irving.web.insurance
 * @author: Ma Xiangxiang
 * @create: 2020-04-23 17:34:03
 * @description: 短信相关的实现类
 */
public class Message implements MessageInterface {

    private static Message instance;

    private Message(){

    }
    public static Message getInstance(){
        if(instance==null){
            instance=new Message();
        }
        return instance;
    }
    /**
     * 发送短信
     *
     * @param para
     * @return
     */
    @Override
    public Map<String, Object> sendMessage(Map<String, Object> para) {
        System.out.println("发送短信");
        Map<String,Object> map = new HashMap<>(4);
        map.put("code","200");
        map.put("message","发送短信");
        return map;
    }
}
