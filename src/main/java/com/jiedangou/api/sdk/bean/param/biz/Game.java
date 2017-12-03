package com.jiedangou.api.sdk.bean.param.biz;

import java.util.List;

/**
 * 游戏
 * Created on 2017/11/22
 *
 * @author Jianghao(howechiang@gmail.com)
 */
public class Game {

    private Integer gameId;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    private String gameName;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    private List<Channel> channels;

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

}
