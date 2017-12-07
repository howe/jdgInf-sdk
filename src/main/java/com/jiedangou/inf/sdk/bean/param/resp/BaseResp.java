package com.jiedangou.inf.sdk.bean.param.resp;

import org.nutz.lang.util.NutMap;

/**
 * Created on 2017/11/19
 *
 * @author Jianghao(howechiang@gmail.com)
 */
public class BaseResp {

    private String status;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    private NutMap data;

    public NutMap getData() {
        return data;
    }

    public void setData(NutMap data) {
        this.data = data;
    }

    public BaseResp(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResp() {
    }

    @Override
    public String toString() {
        return "BaseResp{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
