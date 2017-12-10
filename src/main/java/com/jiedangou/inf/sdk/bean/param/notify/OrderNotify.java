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

    @JsonField(dataFormat = Dict.DATE_FORMART_FULL)
    private Date notifyTime;

    private String notifyType;

    private String orderNum;

    private String pOrderNum;

    private Double addMoney;

    private Integer addTime;

    private String newPassword;

    private OMessage om;

    private Double efficiencyComp;

    private Double safetyComp;

    private Double orderSettle;

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

    public Double getAddMoney() {
        return addMoney;
    }

    public void setAddMoney(Double addMoney) {
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

    public Double getEfficiencyComp() {
        return efficiencyComp;
    }

    public void setEfficiencyComp(Double efficiencyComp) {
        this.efficiencyComp = efficiencyComp;
    }

    public Double getSafetyComp() {
        return safetyComp;
    }

    public void setSafetyComp(Double safetyComp) {
        this.safetyComp = safetyComp;
    }

    public Double getOrderSettle() {
        return orderSettle;
    }

    public void setOrderSettle(Double orderSettle) {
        this.orderSettle = orderSettle;
    }
}
