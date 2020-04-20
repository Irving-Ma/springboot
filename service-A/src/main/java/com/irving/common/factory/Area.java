package com.irving.common.factory;

/**
 * @program: com.irving.common.factory
 * @author: Ma Xiangxiang
 * @create: 2020-04-20 13:55:34
 * @description: 地区统一接口
 */
public interface Area {

    /**
     * 执行地区流程方法
     */
    void excuteAreaProcess();

    /**
     * 获取地区执行结果
     */
    String getAreaInfo();
}
