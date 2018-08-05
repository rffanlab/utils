package io.afu.utils.HttpUtils;

/**
 * Created By: rffan
 * At Time: 2018/7/31
 */
public class HttpResult {

    // http状态码
    private Integer statusCode;

    // 最初的location
    private String primaryLocation;

    // 上一个地址
    private String preLocation;

    // 当前地址
    private String location;

    // Http 返回内容
    private String context;

    // Http 请求方法
    private String method;

    // Http 协议
    private String protocol;

    // 请求头相关
    // UserAgent;
    private String UserAgent;




}
