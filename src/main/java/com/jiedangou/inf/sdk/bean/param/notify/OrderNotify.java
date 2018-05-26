package com.jiedangou.inf.sdk.bean.param.notify;

import com.jiedangou.inf.sdk.bean.dict.Dict;
import com.jiedangou.inf.sdk.bean.param.pro.OMessage;
import org.nutz.json.JsonField;

import java.util.Date;

/**
 * Created on 2017/12/10
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class OrderNotify {

    private Integer providerId;

    private Long timestamp;

    private String version;

    private String sign;

    @JsonField(dataFormat = Dict.DATE_FORMART_FULL, timeZone = Dict.DATE_CHINA_TIMEZONE)
    private Date notifyTime;

    private String notifyType;

    private String orderNum;

    private String pOrderNum;

    private Integer addMoney;

    private Integer addTime;

    private String newPassword;

    private OMessage om;

    private Integer efficiencyComp;

    private Integer safetyComp;

    private Integer orderSettle;

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

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

    public Integer getAddMoney() {
        return addMoney;
    }

    public void setAddMoney(Integer addMoney) {
        this.addMoney = addMoney;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public OMessage getOm() {
        return om;
    }

    public void setOm(OMessage om) {
        this.om = om;
    }

    public Integer getEfficiencyComp() {
        return efficiencyComp;
    }

    public void setEfficiencyComp(Integer efficiencyComp) {
        this.efficiencyComp = efficiencyComp;
    }

    public Integer getSafetyComp() {
        return safetyComp;
    }

    public void setSafetyComp(Integer safetyComp) {
        this.safetyComp = safetyComp;
    }

    public Integer getOrderSettle() {
        return orderSettle;
    }

    public void setOrderSettle(Integer orderSettle) {
        this.orderSettle = orderSettle;
    }
}
