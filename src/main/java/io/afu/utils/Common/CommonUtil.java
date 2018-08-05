package io.afu.utils.Common;

import java.security.SecureRandom;
import java.util.UUID;

/**
 * Created By: rffan
 * At Time: 2018/8/3
 */
public class CommonUtil {

    private static SecureRandom random = new SecureRandom();

    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 使用SecureRandom随机生成Long.
     */
    public static long randomLong() {
        return Math.abs(random.nextLong());
    }


}
