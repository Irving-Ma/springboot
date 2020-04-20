package com.irving.common.factory;

/**
 * @program: com.irving.common.factory
 * @author: Ma Xiangxiang
 * @create: 2020-04-20 13:58:05
 * @description: 天津地区流程
 */
public class TianjinArea implements Area{

    /**
     * 执行天津地区流程方法
     */
    @Override
    public void excuteAreaProcess() {
        System.out.println("执行天津地区流程");
    }

    /**
     * 获取地区执行结果
     */
    @Override
    public String getAreaInfo() {
        return "执行天津地区流程成功";
    }
}
