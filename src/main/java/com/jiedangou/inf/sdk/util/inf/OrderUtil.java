package com.jiedangou.inf.sdk.util.inf;

import com.jiedangou.inf.sdk.bean.dict.Dict;
import com.jiedangou.inf.sdk.bean.param.biz.Order;
import com.jiedangou.inf.sdk.bean.param.req.BaseReq;
import com.jiedangou.inf.sdk.bean.param.req.biz.AcceptOrder;
import com.jiedangou.inf.sdk.bean.param.req.biz.GetNewOrderList;
import com.jiedangou.inf.sdk.bean.param.resp.BaseResp;
import com.jiedangou.inf.sdk.util.HttpUtil;
import com.jiedangou.inf.sdk.util.JdgUtil;
import org.nutz.dao.QueryResult;
import org.nutz.dao.pager.Pager;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Times;

import java.util.List;


/**
 * Created by Jianghao on 2017/12/7
 *
 * @howechiang
 */
public class OrderUtil {

    /**
     * 获取新订单列表
     *
     * @param providerId
     * @param key
     * @param biz
     * @return
     */
    public static QueryResult getNewOrderList(Integer providerId, String key, GetNewOrderList biz) {
        try {
            if (Lang.isEmpty(providerId)) {
                throw new Exception("服务商ID为空");
            }
            if (Strings.isBlank(key)) {
                throw new Exception("密钥为空");
            }
            BaseReq req = new BaseReq();
            req.setProviderId(providerId);
            req.setTimestamp(Times.getTS());
            req.setVersion(Dict.JDG_API_VERSION);
            req.setBizData(Lang.obj2nutmap(biz));
            req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
            String json = HttpUtil.post(Dict.JDG_DEV_API_HOST + Dict.JDG_API_ACTION_ORDER_GETNEWORDERLIST, Json.toJson(req));
            if (Strings.isEmpty(json)) {
                throw new Exception("返回值异常");
            } else {
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                List<Order> orders = resp.getData().getAsList("orders", Order.class);
                Pager pager = resp.getData().getAs("pager", Pager.class);
                return new QueryResult(orders, pager);
            }
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 受理订单
     *
     * @param providerId
     * @param key
     * @param biz
     * @return
     */
    public static Order acceptOrder(Integer providerId, String key, AcceptOrder biz) {

        try {

            if (Lang.isEmpty(providerId)) {
                throw new Exception("服务商ID为空");
            }
            if (Strings.isBlank(key)) {
                throw new Exception("密钥为空");
            }
            if (Strings.isBlank(biz.getOrderNum())) {
                throw new Exception("接单狗订单号为空");
            }
            BaseReq req = new BaseReq();
            req.setProviderId(providerId);
            req.setTimestamp(Times.getTS());
            req.setVersion(Dict.JDG_API_VERSION);
            req.setBizData(Lang.obj2nutmap(biz));
            req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
            String json = HttpUtil.post(Dict.JDG_DEV_API_HOST + Dict.JDG_API_ACTION_ORDER_ACCEPTORDER, Json.toJson(req));
            if (Strings.isEmpty(json)) {
                throw new Exception("返回值异常");
            } else {
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                Order order = resp.getData().getAs("order", Order.class);
                return order;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
