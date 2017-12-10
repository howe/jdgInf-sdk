package com.jiedangou.inf.sdk.bean.param.req.biz;

/**
 * Created on 2017/12/10
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class QueryGame {

    private Integer gameId;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public QueryGame(Integer gameId) {
        this.gameId = gameId;
    }
}
