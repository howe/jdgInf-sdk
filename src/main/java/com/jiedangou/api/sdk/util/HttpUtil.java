package com.jiedangou.api.sdk.util;

import org.nutz.http.*;
import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.log.Log;
import org.nutz.log.Logs;

import java.util.Map;

/**
 * Created on 2017/11/19
 *
 * @author Jianghao(howechiang@gmail.com)
 */
public class HttpUtil {

    protected static final Log log = Logs.get();

    /**
     * 普通Get请求
     *
     * @param url
     * @return
     */
    public static String get(String url) {

        if (Strings.isBlank(url)) {
            log.error("url为空");
            return null;
        } else if (!Strings.isUrl(url)) {
            log.error("url格式不正确");
            return null;
        } else {
            return Http.get(url).getContent();
        }
    }

    /**
     * 普通Post请求
     *
     * @param url
     * @param parms
     * @return
     */

    public static String post(String url, Map<String, Object> parms) {

        if (Strings.isBlank(url)) {
            log.error("url为空");
            return null;
        } else if (!Strings.isUrl(url)) {
            log.error("url格式不正确");
            return null;
        } else if (parms.isEmpty()) {
            log.error("parms为空");
            return null;
        } else {
            return Http.post(url, parms, 10000);
        }
    }

    /**
     * 普通Post请求
     *
     * @param url
     * @return
     */
    public static String post(String url) {

        if (Strings.isBlank(url)) {
            log.error("url为空");
            return null;
        } else if (!Strings.isUrl(url)) {
            log.error("url格式不正确");
            return null;
        } else {
            return Http.post(url, null, 10000);
        }
    }

    /**
     * 带Header信息的Post请求
     *
     * @param url
     * @param header
     * @param parms
     * @return
     */
    public static String post(String url, Header header, Map<String, Object> parms) {

        if (Strings.isBlank(url)) {
            log.error("url为空");
            return null;
        } else if (!Strings.isUrl(url)) {
            log.error("url格式不正确");
            return null;
        } else if (Lang.isEmpty(header)) {
            log.error("header为空");
            return null;
        } else if (header.getAll().isEmpty()) {
            log.error("header为空");
            return null;
        } else if (parms.isEmpty()) {
            log.error("parms为空");
            return null;
        } else {
            return Http.post3(url, parms, header, 10000).getContent();
        }
    }

    /**
     * 带Header信息Get请求
     *
     * @param url
     * @param header
     * @return
     */
    public static String get(String url, Header header) {

        if (Strings.isBlank(url)) {
            log.error("url为空");
            return null;
        } else if (!Strings.isUrl(url)) {
            log.error("url格式不正确");
            return null;
        } else if (Lang.isEmpty(header)) {
            log.error("header为空");
            return null;
        } else if (header.getAll().isEmpty()) {
            log.error("header为空");
            return null;
        } else {
            return Http.get(url, header, 10000).getContent();
        }
    }

    /**
     * Post发送Json请求
     *
     * @param url
     * @param json
     * @return
     */
    public static String post(String url, String json) {

        if (Strings.isBlank(url)) {
            log.error("url为空");
            return null;
        } else if (!Strings.isUrl(url)) {
            log.error("url格式不正确");
            return null;
        } else if (Lang.isEmpty(json)) {
            log.error("json为空");
            return null;
        } else {
            Request req = Request.create(url, Request.METHOD.POST);
            req.getHeader().set("Content-Type", "application/json;charset=UTF-8");
            req.setData(json);
            Response resp = Sender.create(req).setTimeout(6000).send();
            return resp.getContent();
        }
    }

    /**
     * Post发送Xml请求
     *
     * @param url
     * @param xml
     * @return
     */
    public static String postXml(String url, String xml) {

        if (Strings.isBlank(url)) {
            log.error("url为空");
            return null;
        } else if (!Strings.isUrl(url)) {
            log.error("url格式不正确");
            return null;
        } else if (Lang.isEmpty(xml)) {
            log.error("xml为空");
            return null;
        } else {
            return Http.postXML(url, xml, 10000).getContent();
        }
    }
}
