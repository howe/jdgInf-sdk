package com.jiedangou.inf.sdk.util.inf;

import com.jiedangou.inf.sdk.bean.dict.Dict;
import com.jiedangou.inf.sdk.bean.param.biz.Order;
import com.jiedangou.inf.sdk.bean.param.req.BaseReq;
import com.jiedangou.inf.sdk.bean.param.resp.BaseResp;
import com.jiedangou.inf.sdk.util.HttpUtil;
import com.jiedangou.inf.sdk.util.JdgUtil;
import org.nutz.dao.QueryResult;
import org.nutz.dao.pager.Pager;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Times;
import org.nutz.lang.util.NutMap;

import java.util.List;



/**
 * Created by Jianghao on 2017/12/7
 *
 * @howechiang
 */
public class OrderUtil {

    public static QueryResult getNewOrderList(Integer providerId, String key,
                                              Integer gameId, Integer pageNumber,
                                              Integer pageSize) {
        try {
            pageNumber = Lang.isEmpty(pageNumber) ? 1 : pageNumber;
            pageSize = Lang.isEmpty(pageSize) ? 30 : pageSize;
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
            NutMap map = new NutMap();
            if (!Lang.isEmpty(gameId)) {
                map.addv("gameId", gameId);
            }
            map.addv("pageNumber", pageNumber);
            map.addv("pageSize", pageSize);
            req.setBizData(map);
            req.setSign(Lang.md5(JdgUtil.buildParmas(Lang.obj2nutmap(req), new String[]{"sign"}) + key));

            String json = HttpUtil.post(Dict.JDG_API_HOST + Dict.JDG_API_ACTION_GAME_QUERYGAMEDETAIL, Json.toJson(req));
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
}
