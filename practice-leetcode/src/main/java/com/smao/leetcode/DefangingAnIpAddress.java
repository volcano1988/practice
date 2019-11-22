package com.smao.leetcode;

/**
 * 1108. IP 地址无效化
 *
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * 示例 1：
 *      输入：address = "1.1.1.1"
 *      输出："1[.]1[.]1[.]1"
 * 示例 2：
 *      输入：address = "255.100.50.0"
 *      输出："255[.]100[.]50[.]0"
 * 提示：
 *      给出的 address 是一个有效的 IPv4 地址
 *
 * 链接：https://leetcode-cn.com/problems/defanging-an-ip-address
 */
public class DefangingAnIpAddress {
    public static String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i)+"");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print(defangIPaddr("1.1.1.1"));
    }
}
