package com.jiedangou.inf.sdk.bean.param.req.biz;

/**
 * Created by Jianghao on 2017/12/19
 *
 * @howechiang
 */
public class AcceptOrder {

    private String orderNo;

    private String pOrderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getpOrderNo() {
        return pOrderNo;
    }

    public void setpOrderNo(String pOrderNum) {
        this.pOrderNo = pOrderNo;
    }

    public AcceptOrder() {
    }

    public AcceptOrder(String orderNo, String pOrderNo) {
        this.orderNo = orderNo;
        this.pOrderNo = pOrderNo;
    }
}
