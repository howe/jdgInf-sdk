package com.jiedangou.inf.sdk.bean.param.req.biz;

import org.nutz.lang.Lang;

/**
 * Created on 2017/12/10
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class GetNewOrderList {

    private Integer gameId;
    private Integer pageNumber;
    private Integer pageSize;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getPageNumber() {
        return Lang.isEmpty(pageNumber) ? 1 : pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return Lang.isEmpty(pageSize) ? 30 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
