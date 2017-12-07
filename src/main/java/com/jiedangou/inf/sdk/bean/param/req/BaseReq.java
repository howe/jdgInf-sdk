package com.jiedangou.inf.sdk.bean.param.req;

import org.nutz.lang.util.NutMap;

/**
 * Created by Jianghao on 2017/11/21
 *
 * @howechiang
 */
public class BaseReq {

    /**
     * 服务商ID
     */
    private Integer providerId;

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    /**
     * 时间戳
     */
    private Long timestamp;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 版本号
     */
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 签名
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 业务数据
     */
    private NutMap bizData;

    public NutMap getBizData() {
        return bizData;
    }

    public void setBizData(NutMap bizData) {
        this.bizData = bizData;
    }
}
