package com.jiedangou.api.sdk.util;

import com.jiedangou.api.sdk.bean.param.pro.Account;
import com.jiedangou.api.sdk.bean.param.pro.Contact;
import org.nutz.lang.Encoding;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.log.Log;
import org.nutz.log.Logs;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created on 2017/11/25
 *
 * @author Jianghao(howechiang@gmail.com)
 */
public class JdgUtil {

    protected static final Log log = Logs.get();

    /**
     * Map排序
     *
     * @param params 待排序对象
     * @param order  排序后的对象
     * @return
     */
    public static Map<String, Object> sorting(Map<String, Object> params, String order) {

        if (Lang.isEmpty(params)) {
            log.error("params参数为空");
            return null;
        } else {
            Map<String, Object> map = new LinkedHashMap<>();
            if (Strings.equalsIgnoreCase(order, "desc")) {
                params.entrySet().stream()
                        .sorted(Map.Entry.<String, Object>comparingByKey().reversed())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            } else {
                params.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
            }
            return map;
        }
    }

    /**
     * 构建参数
     *
     * @param params 代构建的map
     * @param f      过滤字段
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params, String[] f) {

        if (Lang.isEmpty(f)) {
            log.error("params参数为空");
            return "";
        } else if (Lang.isEmpty(f)) {
            return buildParmas(params);
        } else {
            Arrays.asList(f).stream().forEach(params::remove);
            return buildParmas(params);
        }
    }

    /**
     * 构建参数
     *
     * @param params 代构建的map
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params) {

        if (Lang.isEmpty(params)) {
            log.error("params参数为空");
            return null;
        } else {
            params = sorting(params, "asc");
            StringBuffer sb = new StringBuffer();
            params.forEach((k, v) -> {
                if (!Lang.isEmpty(v)) {
                    sb.append(k + "=" + v + "&");
                }
            });
            return Strings.removeLast(sb.toString().replaceAll(" , ", ",").replaceAll(" ,", ",").replaceAll(", ", ","), '&');
        }
    }

    /**
     * URL转解码
     */
    public static class Url {

        /**
         * 加密
         *
         * @param s
         * @return
         */
        public static String encode(String s) {

            if (Strings.isBlank(s)) {
                log.error("s加密对象为空");
                return "";
            } else {
                try {
                    return URLEncoder.encode(s, Encoding.UTF8);
                } catch (UnsupportedEncodingException e) {
                    log.error(e.getMessage());
                    return "";
                }
            }
        }

        /**
         * 解密
         *
         * @param s
         * @return
         */
        public static String decode(String s) {

            if (Strings.isBlank(s)) {
                log.error("s加密对象为空");
                return "";
            } else {
                try {
                    return URLDecoder.decode(s, Encoding.UTF8);
                } catch (UnsupportedEncodingException e) {
                    log.error(e.getMessage());
                    return "";
                }
            }
        }
    }

    /**
     * BASE64加解密
     */
    public static class Base64 {

        /**
         * 加密
         *
         * @param s
         * @return
         */
        public static String encode(String s) {

            if (Strings.isBlank(s)) {
                log.error("s加密对象为空");
                return "";
            } else {
                return org.nutz.repo.Base64.encodeToString(s.getBytes(Encoding.CHARSET_UTF8), true);
            }
        }

        /**
         * 解密
         *
         * @param s
         * @return
         */
        public static String decode(String s) {
            if (Strings.isBlank(s)) {
                log.error("s解密对象为空");
                return "";
            } else {
                return new String(org.nutz.repo.Base64.decode(s));
            }
        }
    }

    /**
     * 校验签名
     *
     * @param params
     * @param key
     * @return
     */
    public static Boolean checkSign(NutMap params, String key) {

        String sign = params.getString("sign");
        System.out.println(Lang.md5(Url.encode(buildParmas(params, new String[]{"sign"})) + key));
        if (Lang.isEmpty(params)) {
            log.error("params参数为空");
            return false;
        } else if (Strings.isBlank(key)) {
            log.error("key密钥为空");
            return false;
        } else {
            if (Strings.equalsIgnoreCase(Lang.md5(Url.encode(buildParmas(params, new String[]{"sign"})) + key), sign)) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 构建签名
     *
     * @param obj
     * @param key
     * @return
     */
    public static String buildSign(NutMap obj, String key) {
        if (Lang.isEmpty(obj)) {
            log.error("obj加密对象为空");
            return null;
        } else if (Strings.isEmpty(key)) {
            log.error("key密钥为空");
            return null;
        } else {
            return Lang.md5(buildParmas(obj, new String[]{"sign"}) + key);
        }
    }

    /**
     * 判断数字是否存在数组
     *
     * @param array
     * @param val
     * @return
     */
    public static Boolean checkArrayExists(Integer[] array, Integer val) {

        if (Lang.isEmpty(array)) {
            log.error("array为空");
            return false;
        } else if (Lang.isEmpty(val)) {
            log.error("val为空");
            return false;
        } else {
            for (int a : Arrays.asList(array)) {
                if (Lang.equals(a, val)) {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * 验证用户游戏账号
     *
     * @param account 用户游戏账号
     * @return
     */
    public static Boolean checkAccount(Account account) {

        if (Strings.isEmpty(account.getCsrAccount())) {
            log.error("account.csrAccount客户游戏账号为空");
            return false;
        }
        if (Strings.isEmpty(account.getCsrPassword())) {
            log.error("account.csrPassword客户游戏密码为空");
            return false;
        }
        if (Strings.isEmpty(account.getCsrRole())) {
            log.error("account.csrRole客户游戏角色为空");
            return false;
        }
        return true;
    }

    /**
     * 验参客户联系方式
     *
     * @param contact 客户联系方式
     * @return
     */
    public static Boolean checkContact(Contact contact) {

        if (Strings.isEmpty(contact.getCtPhone())) {
            log.error("contact.ctPhone联系电话为空");
            return false;
        }
        if (!Strings.isMobile(contact.getCtPhone())) {
            log.error("contact.ctPhone联系电话格式错误");
            return false;
        }
        if (!Strings.isQQ(contact.getCtQQ())) {
            log.error("contact.ctQQ联系QQ格式错误");
            return false;
        }
        if (!Strings.isEmail(contact.getCtEmail())) {
            log.error("contact.ctEmail联系邮箱格式错误");
            return false;
        }
        return true;
    }

    /**
     * 账号加密
     *
     * @param account
     * @return
     */
    public static Account accountEncryption(Account account) {

        account.setCsrPassword(Base64.encode(account.getCsrPassword()));
        account.setCsrRole(Url.encode(account.getCsrRole()));
        return account;
    }

    /**
     * 账号解密
     *
     * @param account
     * @return
     */
    public static Account accountDecryption(Account account) {
        account.setCsrPassword(Base64.decode(account.getCsrPassword()));
        account.setCsrRole(Url.decode(account.getCsrRole()));
        return account;
    }

    /**
     * 判断字符串是否存在数组
     *
     * @param array
     * @param val
     * @return
     */
    public static Boolean checkArrayExists(String[] array, String val) {

        if (Lang.isEmpty(array)) {
            log.error("array为空");
            return false;
        } else if (Strings.isEmpty(val)) {
            log.error("val为空");
            return false;
        } else {
            for (String a : Arrays.asList(array)) {
                if (Strings.equalsIgnoreCase(a, val)) {
                    return true;
                }
            }
            return false;
        }
    }
}
