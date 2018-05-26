package com.jiedangou.inf.sdk.bean.param.req.biz;

/**
 * Created by Jianghao on 2017/12/22
 *
 * @howechiang
 */
public class FetchOrder {

    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public FetchOrder(String orderNo) {
        this.orderNo = orderNo;
    }

    public FetchOrder() {
    }
}
