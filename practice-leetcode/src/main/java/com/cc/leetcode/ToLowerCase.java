package com.cc.leetcode;

/**
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019/3/25
 */
public class ToLowerCase {

    public String toLowerCase(String str) {
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] < 91 && bytes[i] > 64) {
                bytes[i] += 32;
            }
        }
        return new String(bytes);
    }


}
