package com.smao.leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 * * 链接：https://leetcode-cn.com/problems/palindrome-number
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        boolean flag = true;
        int length = s.length();
        for(int i=0;i<length/2;i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(length-i-1);
            if(c1!=c2){
                flag = false;
                break;
            }
        }
        return flag;
    }
    //方法二
    public static boolean isPalindrome2(int x) {
        if(x<0 || (x%10==0&&x!=0)){
            return false;
        }
        int rev = 0;
        while (x>rev) {
            rev = rev*10+x%10;
            x /= 10;
        }
        if(rev != x){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome2(132231));
    }
}
