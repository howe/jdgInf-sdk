package com.jiedangou.api.sdk.bean.param.pro;

import com.jiedangou.api.sdk.bean.dict.Dict;
import org.nutz.json.JsonField;

import java.util.Date;

/**
 * 订单留言
 * Created by Jianghao on 2017/11/28
 *
 * @howechiang
 */
public class OrderMessage {

    /**
     * 留言时间
     */
    @JsonField(dataFormat = Dict.DATE_FORMART_FULL)
    private Date messageTime;

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    /**
     * 留言
     */
    private String comments;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * 来源
     * 1 系统
     * 2 客户
     * 3 客服
     * 4 服务方
     */
    private Integer source;

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 昵称
     */
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
