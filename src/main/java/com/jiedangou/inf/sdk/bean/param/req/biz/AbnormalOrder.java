package com.jiedangou.inf.sdk.bean.param.req.biz;

import com.jiedangou.inf.sdk.bean.param.pro.OMessage;

/**
 * Created on 2017/12/23
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class AbnormalOrder {

    private String orderNo;

    private OMessage om;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public OMessage getOm() {
        return om;
    }

    public void setOm(OMessage om) {
        this.om = om;
    }

    public AbnormalOrder(String orderNo, OMessage om) {
        this.orderNo = orderNo;
        this.om = om;
    }

    public AbnormalOrder() {
    }
}
