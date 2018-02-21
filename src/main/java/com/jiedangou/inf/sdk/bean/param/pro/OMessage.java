package com.jiedangou.inf.sdk.bean.param.pro;

import com.jiedangou.inf.sdk.bean.dict.Dict;
import org.nutz.json.JsonField;

import java.util.Date;
import java.util.List;

/**
 * 订单留言
 * Created by Jianghao on 2017/11/28
 *
 * @howechiang
 */
public class OMessage {

    /**
     * 留言时间
     */
    @JsonField(dataFormat = Dict.DATE_FORMART_FULL, timeZone = Dict.DATE_CHINA_TIMEZONE)
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
     * 图片地址列表
     */
    private List<String> pics;

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
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

    public OMessage() {
    }

    public OMessage(String comments) {
        this.comments = comments;
    }

    public OMessage(List<String> pics) {
        this.pics = pics;
    }
}
