package com.cc.leetcode;

/**
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * <p>
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * <p>
 * 返回可以通过分割得到的平衡字符串的最大数量。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author cuilongcan
 * @create 2019-11-27
 */
public class SplitaStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        char temp = 'R';
        int m = 0;
        int n = 0;
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            if (temp == chars[i]) {
                m++;
            } else {
                temp = chars[i];
                n++;
            }
            if (m == n) {
                x++;
            } else if (i > 0 && chars[i - 1] != chars[i] && m!=1) {
                m =0;
                n =0;
            }

        }
        return x;
    }

}
