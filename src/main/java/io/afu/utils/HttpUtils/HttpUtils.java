package io.afu.utils.HttpUtils;

import io.afu.utils.Exceptions.HttpException;

import java.util.HashMap;
import java.util.Map;

public class HttpUtils {

    public static String get(String url) throws HttpException {
        return "";
    }

    public static Map<String,Object> getToObject(String url) throws HttpException {
        Map<String,Object> map = new HashMap<String, Object>();

        return map;
    }

    public static HttpResult put(){

        return new HttpResult();
    }

    public static HttpResult delete(){

        return new HttpResult();
    }

    public static HttpResult Post(String url,Map<String,String> params) throws HttpException {
        HttpResult httpResult = new HttpResult();

        return httpResult;
    }











}
