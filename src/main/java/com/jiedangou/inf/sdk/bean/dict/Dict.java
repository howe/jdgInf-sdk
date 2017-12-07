package com.jiedangou.inf.sdk.bean.dict;

/**
 * Created on 2017/11/25
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Dict {

    public static final String DATE_FORMART_FULL = "yyyy-MM-dd HH:mm:ss";
    public static String JDG_API_HOST = "https://inf.jiedangou.com";
    public static String JDG_API_VERSION = "1.0";
    public static String JDG_API_ACTION_GAME_QUERYGAMELIST = "/game/queryGameList.htm";
    public static String JDG_API_ACTION_GAME_QUERYGAMEDETAIL = "/game/queryGame.htm";
    public static String JDG_API_ACTION_ORDER_GETNEWORDERLIST = "/order/getNewOrderList.htm";
    public static String JDG_API_ACTION_ORDER_ACCEPTORDER = "/order/acceptOrder.htm";

    /**
     * 订单类型
     * 1 普通
     * 2 优质
     * 3 私有
     */
    public static final Integer ORDERTYPE_ARRAY[] = {1, 2, 3};

    public static final Integer ORDERTYPE_ORDINARY = 1;
    public static final Integer ORDERTYPE_GRADE = 2;
    public static final Integer ORDERTYPE_PRIVATE = 3;

    /**
     * 代练(Power Leveling)类型
     * 1 排位 默认
     * 2 定位
     * 3 等级
     * 4 陪练
     * 5 匹配
     * 6 晋级
     * 7 级别
     * 0 其他
     */
    public static final Integer PLTYPE_ARRAY[] = {0, 1, 2, 3, 4, 5, 6, 7};

    /**
     * 订单状态
     * 0 已取消
     * 1 已下单（未接手）
     * 2 处理中（代练中）
     * 3 待验收
     * 4 撤销中
     * 5 仲裁中
     * 6 异常
     * 7 锁定
     * 8 已下架
     * 9 已撤销
     * 10 已仲裁
     * 11 强制仲裁
     * 12 申述中（服务商申述）
     * 13 已完成
     * 88 已结算
     * 99 已完结
     */
    public static final Integer ORDERSTATUS_ARRAY[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 88, 99};

    public static final String OPERATIONTYPE_ARRAY[] = {"OP_LOCK", "OP_UNLOCK",
            "OP_APPLY_ACCEPTANCE", "OP_CANCEL_ACCEPTANCE", "OP_COMPLETE_ACCEPTANCE",
            "OP_APPLY_CANCELLATION", "OP_CANCELL_CANCELLATION", "OP_AGREE_WITHDRAW",
            "OP_APPLY_ARBITRATION", "OP_CANCEL_ARBITRATION", "OP_ABNORMAL_EXCEPTION",
            "OP_CANCEL_EXCEPTION", "OP_STOPPAGE_TIME", "OP_FILLING_MONEY", "OP_CORRECT_PASSWORD"};

    /**
     * 锁定账号
     */
    public static final String OPERATIONTYPE_OP_LOCK = "OP_LOCK";
    /**
     * 取消锁定
     */
    public static final String OPERATIONTYPE_OP_UNLOCK = "OP_UNLOCK";
    /**
     * 申请验收
     */
    public static final String OPERATIONTYPE_OP_APPLY_ACCEPTANCE = "OP_APPLY_ACCEPTANCE";
    /**
     * 取消验收
     */
    public static final String OPERATIONTYPE_OP_CANCEL_ACCEPTANCE = "OP_CANCEL_ACCEPTANCE";
    /**
     * 完成验收
     */
    public static final String OPERATIONTYPE_OP_COMPLETE_ACCEPTANCE = "OP_COMPLETE_ACCEPTANCE";
    /**
     * 申请撤销
     */
    public static final String OPERATIONTYPE_OP_APPLY_CANCELLATION = "OP_APPLY_CANCELLATION";
    /**
     * 取消撤销
     */
    public static final String OPERATIONTYPE_OP_CANCELL_CANCELLATION = "OP_CANCELL_CANCELLATION";
    /**
     * 同意撤销
     */
    public static final String OPERATIONTYPE_OP_AGREE_WITHDRAW = "OP_AGREE_WITHDRAW";
    /**
     * 申请仲裁
     */
    public static final String OPERATIONTYPE_OP_APPLY_ARBITRATION = "OP_APPLY_ARBITRATION";
    /**
     * 取消仲裁
     */
    public static final String OPERATIONTYPE_OP_CANCEL_ARBITRATION = "OP_CANCEL_ARBITRATION";
    /**
     * 提交异常
     */
    public static final String OPERATIONTYPE_OP_ABNORMAL_EXCEPTION = "OP_ABNORMAL_EXCEPTION";
    /**
     * 取消异常
     */
    public static final String OPERATIONTYPE_OP_CANCEL_EXCEPTION = "OP_CANCEL_EXCEPTION";
    /**
     * 补时
     */
    public static final String OPERATIONTYPE_OP_STOPPAGE_TIME = "OP_STOPPAGE_TIME";
    /**
     * 补款
     */
    public static final String OPERATIONTYPE_OP_FILLING_MONEY = "OP_FILLING_MONEY";
    /**
     * 修正密码
     */
    public static final String OPERATIONTYPE_OP_CORRECT_PASSWORD = "OP_CORRECT_PASSWORD";

    /**
     * 已取消
     */
    public static final Integer ORDERSTATUS_CANCELLED = 0;

    /**
     * 已下单（未接手）
     */
    public static final Integer ORDERSTATUS_ALREADY_ORDERED = 1;
    /**
     * 处理中（代练中）
     */
    public static final Integer ORDERSTATUS_PROCESSING = 2;

    /**
     * 待验收
     */
    public static final Integer ORDERSTATUS_TO_BE_ACCEPTED = 3;

    /**
     * 撤销中
     */
    public static final Integer ORDERSTATUS_CANCELLATION = 4;

    /**
     * 仲裁中
     */
    public static final Integer ORDERSTATUS_ARBITRATION = 5;

    /**
     * 异常
     */
    public static final Integer ORDERSTATUS_EXCEPTION = 6;

    /**
     * 锁定
     */
    public static final Integer ORDERSTATUS_LOCKED = 7;

    /**
     * 已下架
     */
    public static final Integer ORDERSTATUS_OFF_SHELF = 8;

    /**
     * 已撤销
     */
    public static final Integer ORDERSTATUS_REVOKED = 9;

    /**
     * 已仲裁
     */
    public static final Integer ORDERSTATUS_ARBITRATED = 10;

    /**
     * 强制仲裁
     */
    public static final Integer ORDERSTATUS_MANDATORY_ARBITRATION = 11;

    /**
     * 已结算
     */
    public static final Integer ORDERSTATUS_SETTLED = 88;

    /**
     * 申述中
     */
    public static final Integer ORDERSTATUS_REPRESENTATION = 12;

    /**
     * 已完成
     */
    public static final Integer ORDERSTATUS_COMPLETED = 13;

    /**
     * 已完成
     */
    public static final Integer ORDERSTATUS_FINISHED = 99;
}
