package com.irving.common;

/**
 * @program: com.irving.common
 * @author: Ma Xiangxiang
 * @create: 2019-10-28 14:57:27
 * @description: 微信支付对象
 */
public class WXConst {
    //微信小程序appid
    public static String appId = "wx7753e66f3b6c2801";
    //微信小程序appsecret
    public static String appSecret = "bdbbf92143294c659c8377a00cc08e6c";
    //微信支付主体
    public static String title = "测试支付页面";
    public static String orderNo = "201910290001";
    //微信商户号
    public static String mch_id="";
    //微信支付的商户密钥
    public static final String key = "";
    //获取微信Openid的请求地址
    public static String WxGetOpenIdUrl = "";
    //支付成功后的服务器回调url
    public static final String notify_url="https://api.weixin.qq.com/sns/jscode2session";
    //签名方式
    public static final String SIGNTYPE = "MD5";
    //交易类型
    public static final String TRADETYPE = "JSAPI";
    //微信统一下单接口地址
    public static final String pay_url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
}
