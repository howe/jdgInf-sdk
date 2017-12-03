package com.jiedangou.api.sdk.bean.param.pro;

/**
 * 游戏账号
 * Created on 2017/11/21
 *
 * @author Jianghao(howechiang@gmail.com)
 */
public class Account {

    /**
     * 客户游戏账号
     */
    private String csrAccount;

    public String getCsrAccount() {
        return csrAccount;
    }

    public void setCsrAccount(String csrAccount) {
        this.csrAccount = csrAccount;
    }

    /**
     * 客户游戏密码
     * Base64
     */
    private String csrPassword;

    public String getCsrPassword() {
        return csrPassword;
    }

    public void setCsrPassword(String csrPassword) {
        this.csrPassword = csrPassword;
    }

    /**
     * 客户游戏角色
     * Base64
     */
    private String csrRole;

    public String getCsrRole() {
        return csrRole;
    }

    public void setCsrRole(String csrRole) {
        this.csrRole = csrRole;
    }
}
