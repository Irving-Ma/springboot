package com.irving.service.impl;

import com.irving.mapper.OrderCouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.irving.service.OrderCouponService;

import java.util.List;
import java.util.Map;

@Service
public class OrderCouponServiceImpl implements OrderCouponService{

    @Autowired
    private OrderCouponMapper orderCouponMapper;

    /**
     * 查询用户信息
     *
     * @return
     */
    @Override
    public List<Map<String, Object>> queryUserInfo() {
        return orderCouponMapper.queryUserInfo();
    }
}
