package com.cc.leetcode;

/**
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 * <p>
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 * <p>
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/di-string-match
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019-12-23
 */
public class DIStringMatch {

    public int[] diStringMatch(String S) {
        int max = S.length();
        int min = 0;
        int[] x = new int[S.length() + 1];
        for (int i = 0; i < S.toCharArray().length; i++) {
            if (S.toCharArray()[i] == 'I') {
                x[i] = min;
                min++;
            } else if (S.toCharArray()[i] == 'D') {
                x[i] = max;
                max--;
            }
        }
        x[S.length()] = max;
        return x;
    }

    public static void main(String[] args) {
        new DIStringMatch().diStringMatch("IDID");
    }
}
