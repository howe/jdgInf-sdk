package com.jiedangou.inf.sdk.bean.param.req.biz;

/**
 * Created by Jianghao on 2017/12/22
 *
 * @howechiang
 */
public class QueryAccount {

    private String payPassword;

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public QueryAccount() {
    }

    public QueryAccount(String payPassword) {
        this.payPassword = payPassword;
    }
}
