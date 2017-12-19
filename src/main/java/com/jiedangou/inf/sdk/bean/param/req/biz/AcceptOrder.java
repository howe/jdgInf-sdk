package com.jiedangou.inf.sdk.bean.param.req.biz;

/**
 * Created by Jianghao on 2017/12/19
 *
 * @howechiang
 */
public class AcceptOrder {

    private String orderNum;

    private String pOrderNum;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getpOrderNum() {
        return pOrderNum;
    }

    public void setpOrderNum(String pOrderNum) {
        this.pOrderNum = pOrderNum;
    }

    public AcceptOrder() {
    }

    public AcceptOrder(String orderNum, String pOrderNum) {
        this.orderNum = orderNum;
        this.pOrderNum = pOrderNum;
    }
}
