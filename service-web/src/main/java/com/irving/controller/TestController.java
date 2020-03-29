package com.irving.controller;

import com.irving.common.Aes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irving.service.OrderCouponService;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class TestController {
	@Autowired
    private OrderCouponService orderCouponService;

    /**
     * 列表
     */
    @RequestMapping("/index")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index.html");
        return modelAndView;
    }

    @RequestMapping("/userInfo")
    public Map<String,Object> userInfo(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<>();
        String data = request.getParameter("data");
        System.out.println(new Aes().decrypt("F97F4471B923625FAE10860D7F75A164"));
        System.out.println(new Aes().encrypt("123456"));
        //List<Map<String,Object>> userList = orderCouponService.queryUserInfo();
        List<Map<String,Object>> userList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String,Object> temp = new HashMap<>();
            temp.put("user_name","马祥祥");
            temp.put("user_Idcar","61042899404053110");
            temp.put("user_birthday","2019-10-24 10:39:39");
            temp.put("user_sex","1");
            userList.add(temp);
        }

        map.put("userList",userList);
        map.put("resultCode",200);
        map.put("resultMsg","获取用户信息成功");
        /*map.put("name","Irving");
        map.put("age",26);
        map.put("sax","男");*/
        return map;
    }

    @RequestMapping("/getMessage")
    public Map<String,Object> getMessage(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<>();
        String formId = request.getParameter("formId");
        String openId = request.getParameter("openId");

        map.put("resultCode",200);
        map.put("resultMsg","获取用户信息成功");
        return map;
    }
}
