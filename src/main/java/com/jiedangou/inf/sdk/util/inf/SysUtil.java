package com.jiedangou.inf.sdk.util.inf;

import com.jiedangou.inf.sdk.bean.dict.Dict;
import com.jiedangou.inf.sdk.bean.param.req.BaseReq;
import com.jiedangou.inf.sdk.bean.param.req.biz.QueryMargin;
import com.jiedangou.inf.sdk.bean.param.resp.BaseResp;
import com.jiedangou.inf.sdk.util.HttpUtil;
import com.jiedangou.inf.sdk.util.JdgUtil;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Times;

/**
 * Created by Jianghao on 2017/12/22
 *
 * @howechiang
 */
public class SysUtil {


    /**
     * 查看剩余保证金
     *
     * @param providerId
     * @param key
     * @param biz
     * @return
     */
    public static Double queryMargin(Integer providerId, String key, QueryMargin biz) {
        try {
            if (Lang.isEmpty(providerId)) {
                throw new Exception("服务商ID为空");
            }
            if (Strings.isBlank(key)) {
                throw new Exception("密钥为空");
            }
            if (Strings.isBlank(biz.getPayPassword())) {
                throw new Exception("支付密码为空");
            }
            BaseReq req = new BaseReq();
            req.setProviderId(providerId);
            req.setTimestamp(Times.getTS());
            req.setVersion(Dict.JDG_API_VERSION);
            biz.setPayPassword(Lang.md5(biz.getPayPassword()));
            req.setBizData(Lang.obj2nutmap(biz));
            req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
            String json = HttpUtil.post(Dict.JDG_DEV_API_HOST + Dict.JDG_API_ACTION_SYS_QUERYMARGIN, Json.toJson(req));
            if (Strings.isEmpty(json)) {
                throw new Exception("返回值异常");
            } else {
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                return resp.getData().getDouble("margin", 0.0);
            }
        } catch (Exception e) {
            return null;
        }
    }
}
