package com.jiedangou.inf.sdk.util.inf;

import com.jiedangou.inf.sdk.bean.dict.Dict;
import com.jiedangou.inf.sdk.bean.param.biz.Game;
import com.jiedangou.inf.sdk.bean.param.req.BaseReq;
import com.jiedangou.inf.sdk.bean.param.req.biz.QueryGame;
import com.jiedangou.inf.sdk.bean.param.resp.BaseResp;
import com.jiedangou.inf.sdk.util.HttpUtil;
import com.jiedangou.inf.sdk.util.JdgUtil;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Times;
import org.nutz.lang.util.NutMap;

import java.util.List;

/**
 * Created on 2017/11/25
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class GameUtil {

    /**
     * 4.1 获取游戏列表
     *
     * @param providerId 服务商ID
     * @param key        密钥key
     * @return
     */
    public static List<Game> queryGameList(Integer providerId, String key) {

        try {
            if (Lang.isEmpty(providerId)) {
                throw new Exception("服务商ID为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else {
                BaseReq req = new BaseReq();
                req.setProviderId(providerId);
                req.setTimestamp(Times.getTS());
                req.setVersion(Dict.JDG_API_VERSION);
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict.JDG_DEV_API_HOST + Dict.JDG_API_ACTION_GAME_QUERYGAMELIST, Json.toJson(req));
                if (Strings.isEmpty(json)) {
                    throw new Exception("返回值异常");
                } else {
                    BaseResp resp = Json.fromJson(BaseResp.class, json);
                    List<Game> games = resp.getData().getAsList("games", Game.class);
                    return games;
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 4.2 获取游戏区服详情
     *
     * @param providerId 服务商ID
     * @param key        密钥key
     * @return
     */
    public static Game queryGame(Integer providerId, String key, QueryGame biz) {

        try {
            if (Lang.isEmpty(providerId)) {
                throw new Exception("服务商ID为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key为空");
            } else if (Lang.isEmpty(biz.getGameId())) {
                throw new Exception("gameId为空");
            } else {
                BaseReq req = new BaseReq();
                req.setProviderId(providerId);
                req.setTimestamp(Times.getTS());
                req.setVersion(Dict.JDG_API_VERSION);
                req.setBizData(Lang.obj2nutmap(biz));
                req.setSign(JdgUtil.getSign(Lang.obj2nutmap(req), key));
                String json = HttpUtil.post(Dict.JDG_DEV_API_HOST + Dict.JDG_API_ACTION_GAME_QUERYGAMEDETAIL, Json.toJson(req));
                if (Strings.isEmpty(json)) {
                    throw new Exception("返回值异常");
                } else {
                    BaseResp resp = Json.fromJson(BaseResp.class, json);
                    Game game = resp.getData().getAs("game", Game.class);
                    return game;
                }
            }
        } catch (Exception e) {
            return null;
        }
    }
}
