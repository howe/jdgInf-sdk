package com.jiedangou.inf.sdk.bean.param.req.biz;

import com.jiedangou.inf.sdk.bean.param.pro.OMessage;

/**
 * Created on 2017/12/23
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class ApplycancelOrder {

    private String orderNo;

    /**
     * 需支付的赔偿金
     * 单位 分
     */
    private int recoup;

    /**
     * 需收取的报酬
     * 单位 分
     */
    private int reward;

    private String payPassword;

    private OMessage om;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getRecoup() {
        return recoup;
    }

    public void setRecoup(int recoup) {
        this.recoup = recoup;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
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

    public ApplycancelOrder(String orderNo, int recoup, int reward, String payPassword, OMessage om) {
        this.orderNo = orderNo;
        this.recoup = recoup;
        this.reward = reward;
        this.payPassword = payPassword;
        this.om = om;
    }

    public ApplycancelOrder() {
    }
}
