package com.zhengxu.alipaydemo.service;

import com.alipay.api.AlipayApiException;
import com.zhengxu.alipaydemo.bean.AlipayBean;

/*支付服务*/
public interface PayService {
    /*支付宝*/
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;
}