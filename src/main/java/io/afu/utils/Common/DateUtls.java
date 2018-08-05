package io.afu.utils.Common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created By: rffan
 * At Time: 2018/7/31
 */
public class DateUtls {

    /**
     * 通过格式来获取当前日期
     * @param format
     * @return
     */
    public static String getNowDatetimeByFormat(String format){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    /**
     * 通过格式来获取目标时间的字符串输出
     * @param target
     * @param format
     * @return
     */
    public static String getTimeStrByFormat(Date target,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(target);
    }

    /**
     * 获取当前日期，格式为yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String getNowDatetimeWithMiddleBar(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    /**
     * 获取目标时间，格式为yyyy-MM-dd HH:mm:ss
     * @param target
     * @return
     */
    public static String getTimeStrWithMiddleBar(Date target){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(target);
    }

    /**
     * 获取当前时间的时间戳
     * @return
     */
    public static long getNowTimestamp(){
        return System.currentTimeMillis();
    }







}
