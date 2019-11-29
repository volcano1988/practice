package com.smao.leetcode;

import java.util.Stack;

/**
 * 1221. 分割平衡字符串
 *
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *
 * 返回可以通过分割得到的平衡字符串的最大数量。
 *
 * 示例 1：
 *      输入：s = "RLRRLLRLRL"
 *      输出：4
 *      解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 *
 * 示例 2：
 *       输入：s = "RLLLLRRRLR"
 *      输出：3
 *      解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 *
 * 示例 3：
 *      输入：s = "LLLLRRRR"
 *      输出：1
 *      解释：s 只能保持原样 "LLLLRRRR".
 *
 * 提示：
 *      1 <= s.length <= 1000
 *      s[i] = 'L' 或 'R'
 *
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 */
public class SplitAStringInBalancedStrings {
    public static int balancedStringSplit(String s) {
        int num = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack == null || stack.size() == 0) {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.peek() != s.charAt(i)) {
                stack.pop();
                if (stack == null || stack.size() == 0) {
                    num++;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.print(balancedStringSplitDS("LLLLRRRR"));
    }

    /**
     * 问题分析：分割平衡串，得到尽可能多的平衡串。这是一个适用贪心算法的问题，在适当的位置截断源串得到平衡子串，截断后前后子串的计数不互相影响（无后效性），且所有局部最优相加即为整体的最优解。
     * 解决思路：
     * 1、设置一个'L'与'R'的差值计数器diffCount，设置一个平衡子串计数器count；
     * 2、顺序遍历源串字符，遇L则diffCount+1，遇到R则diffCount-1；
     * 3、每遍历一个字符检查一次diffCount是否为0，若为0则count+1
     * @param s
     * @return
     */
    public static int balancedStringSplitDS(String s) {
        if ("".equals(s) || s.length() == 0) {
            return 0;
        }
        int diffCount = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                diffCount++;
            }else{
                diffCount--;
            }
            if(diffCount==0){
                count++;
            }
        }
        return count;
    }
}
