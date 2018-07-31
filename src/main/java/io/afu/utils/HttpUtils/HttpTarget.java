package io.afu.utils.HttpUtils;

import java.util.Map;

/**
 * Created By: rffan
 * At Time: 2018/7/31
 */
public class HttpTarget {

    // 目标url
    private String url;

    // 头信息
    private Map<String,String> headers;

    // 特定头信息UserAgent
    private String userAgent;

    private String contentType;

}
