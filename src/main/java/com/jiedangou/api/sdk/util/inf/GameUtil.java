package com.jiedangou.api.sdk.util.inf;

import com.jiedangou.api.sdk.bean.dict.Dict;
import com.jiedangou.api.sdk.bean.param.biz.Game;
import com.jiedangou.api.sdk.bean.param.req.BaseReq;
import com.jiedangou.api.sdk.bean.param.resp.BaseResp;
import com.jiedangou.api.sdk.util.HttpUtil;
import com.jiedangou.api.sdk.util.JdgUtil;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.Times;
import org.nutz.lang.util.NutMap;
import org.nutz.log.Log;
import org.nutz.log.Logs;

import java.util.List;

/**
 * Created on 2017/11/25
 *
 * @author Jianghao(howechiang@gmail.com)
 */
public class GameUtil {

    protected static final Log log = Logs.get();

    /**
     * 4.1 获取游戏列表
     *
     * @param providerId 服务商ID
     * @param key        密钥key
     * @return
     */
    public static List<Game> queryGameList(Integer providerId, String key) {

        if (Lang.isEmpty(providerId)) {
            log.error("服务商ID为空");
            return null;
        } else if (Strings.isBlank(key)) {
            log.error("key为空");
            return null;
        } else {
            BaseReq req = new BaseReq();
            req.setProviderId(providerId);
            req.setTimestamp(Times.getTS());
            req.setVersion(Dict.JDG_API_VERSION);
            req.setSign(Lang.md5(JdgUtil.buildParmas(Lang.obj2nutmap(req), new String[]{"sign"}) + key));
            String json = HttpUtil.post(Dict.JDG_API_HOST + Dict.JDG_API_ACTION_GAME_QUERYGAMELIST, Json.toJson(req));
            if (Strings.isEmpty(json)) {
                log.error("返回值异常");
                return null;
            } else {
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                List<Game> games = resp.getData().getAsList("games", Game.class);
                return games;
            }
        }
    }

    /**
     * 4.2 获取游戏区服详情
     *
     * @param providerId 服务商ID
     * @param key        密钥key
     * @return
     */
    public static Game queryGame(Integer providerId, String key, Integer gameId) {

        if (Lang.isEmpty(providerId)) {
            log.error("服务商IDREADME.md为空");
            return null;
        } else if (Strings.isBlank(key)) {
            log.error("key为空");
            return null;
        } else if (Lang.isEmpty(gameId)) {
            log.error("gameId为空");
            return null;
        } else {
            BaseReq req = new BaseReq();
            req.setProviderId(providerId);
            req.setTimestamp(Times.getTS());
            req.setVersion(Dict.JDG_API_VERSION);
            req.setBizData(new NutMap("gameId", gameId));
            req.setSign(Lang.md5(JdgUtil.buildParmas(Lang.obj2nutmap(req), new String[]{"sign"}) + key));
            String json = HttpUtil.post(Dict.JDG_API_HOST + Dict.JDG_API_ACTION_GAME_QUERYGAMEDETAIL, Json.toJson(req));
            if (Strings.isEmpty(json)) {
                log.error("返回值异常");
                return null;
            } else {
                BaseResp resp = Json.fromJson(BaseResp.class, json);
                Game game = resp.getData().getAs("game", Game.class);
                return game;
            }
        }
    }
}
