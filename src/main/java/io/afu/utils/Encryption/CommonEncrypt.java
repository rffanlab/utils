package io.afu.utils.Encryption;

import java.security.MessageDigest;

/**
 * Created By: rffan
 * At Time: 2018/7/31
 */
public class CommonEncrypt {


    // md5 加密
    public static String Encoder(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            char[] strChars = str.toCharArray();
            byte[] strBytes = new byte[strChars.length];
            for (int i = 0; i < strChars.length; i++)
                strBytes[i] = (byte) strChars[i];
            byte[] md5Bytes = md5.digest(strBytes);
            StringBuffer hexValue = new StringBuffer();
            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16)
                    hexValue.append("0");
                hexValue.append(Integer.toHexString(val));
            }
            return hexValue.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return "";
        }
    }


    // 密码使用md5+盐的方式加密



    // sha1 加密


    // hmac 加密



}
