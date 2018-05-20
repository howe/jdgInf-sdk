package com.jiedangou.inf.sdk.bean.param.biz;

import com.jiedangou.inf.sdk.bean.dict.Dict;
import com.jiedangou.inf.sdk.bean.param.pro.Account;
import com.jiedangou.inf.sdk.bean.param.pro.Contact;
import com.jiedangou.inf.sdk.bean.param.pro.OMessage;
import org.nutz.json.JsonField;

import java.util.Date;
import java.util.List;

/**
 * 订单
 * Created on 2017/11/21
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class PrOrder {

    /**
     * 接单狗订单编号
     */
    private String orderNum;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 合作商ID
     */
    private Integer partnerId;

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 合作商订单号
     */
    private String outOrderNum;

    public String getOutOrderNum() {
        return outOrderNum;
    }

    public void setOutOrderNum(String outOrderNum) {
        this.outOrderNum = outOrderNum;
    }

    /**
     * 服务商订单号
     */
    private String pOrderNum;

    public String getpOrderNum() {
        return pOrderNum;
    }

    public void setpOrderNum(String pOrderNum) {
        this.pOrderNum = pOrderNum;
    }

    /**
     * 创建时间
     */
    @JsonField(dataFormat = Dict.DATE_FORMART_FULL, timeZone = Dict.DATE_CHINA_TIMEZONE)
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 订单状态
     * 0 已取消
     * 1 已下单（未接手）
     * 2 已接单（未处理）
     * 3 处理中（代练中）
     * 4 待验收
     * 5 主动撤销中（打手）
     * 6 仲裁中
     * 7 异常
     * 8 锁定
     * 9 已下架
     * 10 已撤销
     * 11 已仲裁
     * 12 强制仲裁
     * 13 申述中（服务商申述）
     * 14 已完成
     * 15 被动撤销中（号主）
     * 88 已结算
     */
    private Integer orderStatus;

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 游戏ID
     */
    private Integer gameId;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * 游戏名称
     */
    private String gameName;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /**
     * 渠道ID
     */
    private Integer channelId;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * 渠道名称
     */
    private String channelName;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * 服务器ID
     */
    private Integer serverId;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    /**
     * 服务器名称
     */
    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * 订单标题
     */
    private String orderTitle;

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    /**
     * 订单类型
     * 1 普通
     * 2 优质
     * 3 私有
     */
    private Integer orderType;

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

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
     * 安全保证金
     * 单位 分
     */
    private int safetyMargin;

    public int getSafetyMargin() {
        return safetyMargin;
    }

    public void setSafetyMargin(int safetyMargin) {
        this.safetyMargin = safetyMargin;
    }

    /**
     * 效率保证金
     * 单位 分
     */
    private int efficiencyMargin;

    public int getEfficiencyMargin() {
        return efficiencyMargin;
    }

    public void setEfficiencyMargin(int efficiencyMargin) {
        this.efficiencyMargin = efficiencyMargin;
    }

    /**
     * 订单要求完成时间
     * 单位 小时
     */
    private int requiredCompleteTime;

    public int getRequiredCompleteTime() {
        return requiredCompleteTime;
    }

    public void setRequiredCompleteTime(int requiredCompleteTime) {
        this.requiredCompleteTime = requiredCompleteTime;
    }

    /**
     * 代练(Power Leveling)类型
     * 1 排位
     * 2 定位
     * 3 等级
     * 4 陪练
     * 5 匹配
     * 6 晋级
     * 7 级别
     * 0 其他
     */
    private Integer plType;

    public Integer getPlType() {
        return plType;
    }

    public void setPlType(Integer plType) {
        this.plType = plType;
    }

    /**
     * 代练(Power Leveling)要求
     */
    private String plRequired;

    public String getPlRequired() {
        return plRequired;
    }

    public void setPlRequired(String plRequired) {
        this.plRequired = plRequired;
    }

    /**
     * 订单说明
     */
    private String orderDesc;

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    /**
     * 客户游戏账号
     */
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * 订单备注
     */
    private String orderRemark;

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    /**
     * 联系方式
     */
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * 订单留言
     */
    private List<OMessage> oms;

    public List<OMessage> getOms() {
        return oms;
    }

    public void setOms(List<OMessage> oms) {
        this.oms = oms;
    }

    /**
     * 是否完结
     */
    private boolean isFinished;

    public boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean finished) {
        isFinished = finished;
    }

    /**
     * 任务接手时间
     */
    @JsonField(dataFormat = Dict.DATE_FORMART_FULL, timeZone = Dict.DATE_CHINA_TIMEZONE)
    private Date plAcceptTime;

    public Date getPlAcceptTime() {
        return plAcceptTime;
    }

    public void setPlAcceptTime(Date plAcceptTime) {
        this.plAcceptTime = plAcceptTime;
    }

    /**
     * 任务开始时间
     */
    @JsonField(dataFormat = Dict.DATE_FORMART_FULL, timeZone = Dict.DATE_CHINA_TIMEZONE)
    private Date plBeginTime;

    public Date getPlBeginTime() {
        return plBeginTime;
    }

    public void setPlBeginTime(Date plBeginTime) {
        this.plBeginTime = plBeginTime;
    }

    /**
     * 任务完成时间
     */
    @JsonField(dataFormat = Dict.DATE_FORMART_FULL, timeZone = Dict.DATE_CHINA_TIMEZONE)
    private Date plCompleteTime;

    public Date getPlCompleteTime() {
        return plCompleteTime;
    }

    public void setPlCompleteTime(Date plCompleteTime) {
        this.plCompleteTime = plCompleteTime;
    }

    /**
     * 订单外放金额
     * 单位 分
     */
    private int orderPrice;

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * 订单奖励金额
     * 单位 分
     */
    private int orderAward;

    public int getOrderAward() {
        return orderAward;
    }

    public void setOrderAward(int orderAward) {
        this.orderAward = orderAward;
    }

    /**
     * 赔偿金额
     * 单位 分
     */
    private int orderDamage;

    public int getOrderDamage() {
        return orderDamage;
    }

    public void setOrderDamage(int orderDamage) {
        this.orderDamage = orderDamage;
    }

    /**
     * 订单实际结算金额
     * 单位 分
     */
    private int orderSettle;

    public int getOrderSettle() {
        return orderSettle;
    }

    public void setOrderSettle(int orderSettle) {
        this.orderSettle = orderSettle;
    }

    /**
     * 订单结算时间
     */
    @JsonField(dataFormat = Dict.DATE_FORMART_FULL, timeZone = Dict.DATE_CHINA_TIMEZONE)
    private Date settleTime;

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    /**
     * 订单完结时间
     */
    @JsonField(dataFormat = Dict.DATE_FORMART_FULL, timeZone = Dict.DATE_CHINA_TIMEZONE)
    private Date finishedTime;

    public Date getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    /**
     * 订单锁定状态
     */
    private boolean isLock;

    public boolean getLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    /**
     * 订单来源
     */
    private String orderSource;

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    /**
     * 订单处理
     */
    private String orderReceive;

    public String getOrderReceive() {
        return orderReceive;
    }

    public void setOrderReceive(String orderReceive) {
        this.orderReceive = orderReceive;

    }
}
