package com.irving.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderCouponMapper {

    List<Map<String,Object>> queryUserInfo();

}