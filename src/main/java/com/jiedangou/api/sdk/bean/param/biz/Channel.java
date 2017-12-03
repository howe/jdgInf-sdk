package com.jiedangou.api.sdk.bean.param.biz;

import java.util.List;

/**
 * 渠道
 * Created on 2017/11/22
 *
 * @author Jianghao(howechiang@gmail.com)
 */
public class Channel {

    private Integer channelId;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    private String channelName;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    List<Server> servers;

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

}
