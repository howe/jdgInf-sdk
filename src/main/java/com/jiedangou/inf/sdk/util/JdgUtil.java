package com.jiedangou.inf.sdk.util;

import com.jiedangou.inf.sdk.bean.param.pro.Account;
import com.jiedangou.inf.sdk.bean.param.pro.Contact;
import org.nutz.lang.Encoding;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created on 2017/11/25
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class JdgUtil {

    /**
     * Map排序
     *
     * @param params 待排序对象
     * @param order  排序后的对象
     * @return
     */
    public static Map<String, Object> sorting(Map<String, Object> params, String order) {

        try {
            if (Lang.isEmpty(params)) {
                throw new Exception("params参数为空");
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
        } catch (Exception e) {
            return null;
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

        try {
            if (Lang.isEmpty(f)) {
                throw new Exception("params参数为空");
            } else if (Lang.isEmpty(f)) {
                return buildParmas(params);
            } else {
                Arrays.asList(f).stream().forEach(params::remove);
                return buildParmas(params);
            }
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 构建参数
     *
     * @param params 代构建的map
     * @return 构建过的字符串
     */
    public static String buildParmas(Map<String, Object> params) {

        try {
            if (Lang.isEmpty(params)) {
                throw new Exception("params参数为空");
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
        } catch (Exception e) {
            return null;
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

            try {
                if (Strings.isBlank(s)) {
                    throw new Exception("s加密对象为空");
                } else {
                    try {
                        return URLEncoder.encode(s, Encoding.UTF8);
                    } catch (UnsupportedEncodingException e) {
                        throw new Exception(e.getMessage());
                    }
                }
            } catch (Exception e) {
                return null;
            }
        }

        /**
         * 解密
         *
         * @param s
         * @return
         */
        public static String decode(String s) {
            try {
                if (Strings.isBlank(s)) {
                    throw new Exception("s加密对象为空");
                } else {
                    try {
                        return URLDecoder.decode(s, Encoding.UTF8);
                    } catch (UnsupportedEncodingException e) {
                        throw new Exception(e.getMessage());
                    }
                }
            } catch (Exception e) {
                return null;
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
            try {
                if (Strings.isBlank(s)) {
                    throw new Exception("s加密对象为空");
                } else {
                    return org.nutz.repo.Base64.encodeToString(s.getBytes(Encoding.CHARSET_UTF8), true);
                }
            } catch (Exception e) {
                return null;
            }
        }

        /**
         * 解密
         *
         * @param s
         * @return
         */
        public static String decode(String s) {
            try {
                if (Strings.isBlank(s)) {
                    throw new Exception("s解密对象为空");
                } else {
                    return new String(org.nutz.repo.Base64.decode(s));
                }
            } catch (Exception e) {
                return null;
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

        try {
            String sign = params.getString("sign");
            if (Lang.isEmpty(params)) {
                throw new Exception("params参数为空");
            } else if (Strings.isBlank(key)) {
                throw new Exception("key密钥为空");
            } else {
                if (Strings.equalsIgnoreCase(Lang.md5(Url.encode(buildParmas(params, new String[]{"sign"})) + key), sign)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
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
        try {
            if (Lang.isEmpty(obj)) {
                throw new Exception("obj加密对象为空");
            } else if (Strings.isEmpty(key)) {
                throw new Exception("key密钥为空");
            } else {
                return Lang.md5(buildParmas(obj, new String[]{"sign"}) + key);
            }
        } catch (Exception e) {
            return null;
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

        try {
            if (Lang.isEmpty(array)) {
                throw new Exception("array为空");
            } else if (Lang.isEmpty(val)) {
                throw new Exception("val为空");
            } else {
                for (int a : Arrays.asList(array)) {
                    if (Lang.equals(a, val)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e) {
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

        try {
            if (Strings.isEmpty(account.getCsrAccount())) {
                throw new Exception("account.csrAccount客户游戏账号为空");
            }
            if (Strings.isEmpty(account.getCsrPassword())) {
                throw new Exception("account.csrPassword客户游戏密码为空");
            }
            if (Strings.isEmpty(account.getCsrRole())) {
                throw new Exception("account.csrRole客户游戏角色为空");
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 验参客户联系方式
     *
     * @param contact 客户联系方式
     * @return
     */
    public static Boolean checkContact(Contact contact) {

        try {
            if (Strings.isEmpty(contact.getCtPhone())) {
                throw new Exception("contact.ctPhone联系电话为空");
            }
            if (!Strings.isMobile(contact.getCtPhone())) {
                throw new Exception("contact.ctPhone联系电话格式错误");
            }
            if (!Strings.isQQ(contact.getCtQQ())) {
                throw new Exception("contact.ctQQ联系QQ格式错误");
            }
            if (!Strings.isEmail(contact.getCtEmail())) {
                throw new Exception("contact.ctEmail联系邮箱格式错误");
            }
            return true;
        } catch (Exception e) {
            return false;
        }
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

        try {

            if (Lang.isEmpty(array)) {
                throw new Exception("array为空");
            } else if (Strings.isEmpty(val)) {
                throw new Exception("val为空");
            } else {
                for (String a : Arrays.asList(array)) {
                    if (Strings.equalsIgnoreCase(a, val)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
