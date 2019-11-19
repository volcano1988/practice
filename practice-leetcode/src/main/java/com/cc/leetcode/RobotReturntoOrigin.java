package com.cc.leetcode;

/**
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019/3/26
 */
public class RobotReturntoOrigin {
    public boolean judgeCircle(String moves) {
        int i =0;
        int j =0;
        char[] chars = moves.toCharArray();
        for (int m = 0; m < chars.length; m++) {
            if (chars[m] =='R') {
                i ++;
            }
            if (chars[m] =='L') {
                i--;
            }
            if (chars[m] =='U') {
                j++;
            }
            if (chars[m] =='D') {
                j--;
            }
        }
        if (i==j&j==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new RobotReturntoOrigin().judgeCircle("RL"));
    }
}
