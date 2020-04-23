package com.irving.web;

import com.irving.common.factory.Area;
import com.irving.common.factory.AreaFactory;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: com.irving.common.factory
 * @author: Ma Xiangxiang
 * @create: 2020-04-20 13:58:05
 * @description: 地区流程执行
 */
@RestController
public class AreaController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    /**
     * 不同地区接口
     * @param jsonObject
     * @return
     */
    @RequestMapping(value = "/excuteArea" ,method = RequestMethod.POST)
    @ResponseBody
    public JSONObject excuteArea(@RequestBody JSONObject jsonObject) {
        JSONObject result = new JSONObject();

        //获取参数
        String areaCode = jsonObject.getOrDefault("areaCode","00").toString().intern();

        //通过地区编码获取地区对象
        Area area = AreaFactory.getAreaByCode(areaCode);
        //执行当前地区的方法
        area.excuteAreaProcess();

        result.put("resultCode","0000");
        result.put("resultMsg",area.getAreaInfo());

        return result;
    }
    
}