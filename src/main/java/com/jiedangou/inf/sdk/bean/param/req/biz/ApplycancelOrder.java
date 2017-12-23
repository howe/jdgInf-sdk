package com.jiedangou.inf.sdk.bean.param.req.biz;

import com.jiedangou.inf.sdk.bean.param.pro.OMessage;

/**
 * Created on 2017/12/23
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class ApplycancelOrder {

    private String orderNum;

    private Double recoup;

    private Double reward;

    private String payPassword;

    private OMessage om;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Double getRecoup() {
        return recoup;
    }

    public void setRecoup(Double recoup) {
        this.recoup = recoup;
    }

    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public OMessage getOm() {
        return om;
    }

    public void setOm(OMessage om) {
        this.om = om;
    }

    public ApplycancelOrder(String orderNum, Double recoup, Double reward, String payPassword, OMessage om) {
        this.orderNum = orderNum;
        this.recoup = recoup;
        this.reward = reward;
        this.payPassword = payPassword;
        this.om = om;
    }

    public ApplycancelOrder() {
    }
}
