package com.cc.leetcode;

/**
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 *
 * @author cuilongcan
 * @create 2019-11-22
 */
public class DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        String[] split = address.split("\\.");
        // 由于字符串是不可变变量，在循环中叠加每次都会创建新的变量，消耗资源

        StringBuilder defangIP = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i == split.length - 1) {
                defangIP.append(split[i]);
            } else {
                defangIP.append(split[i]).append("[.]");
            }
        }
        return defangIP.toString();
    }

    public static void main(String[] args) {
        new DefangingAnIPAddress().defangIPaddr("1.1.1.1");
    }
}
