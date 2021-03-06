package com.smao.leetcode;

/**
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * 示例 1:
 *      输入: J = "aA", S = "aAAbbbb"
 *      输出: 3
 * 示例 2:
 *      输入: J = "z", S = "ZZ"
 *      输出: 0
 * 注意:
 *      S 和 J 最多含有50个字母。
 *      J 中的字符不重复。
 *
 * 链接：https://leetcode-cn.com/problems/jewels-and-stones
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int nums = 0;
        for(int i=0;i<S.length();i++){
            if(J.contains(S.charAt(i)+"")){
                nums++;
            }
        }
        return nums;
    }

    /**
     * 牛逼大神写的99%的
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStonesDashen(String J, String S) {
        char[] Jc = J.toCharArray();
        char[] Sc = S.toCharArray();
        int result = 0;
        int[] indexMap = new int[150];
        for (int h = 0; h < S.length(); h++) {
            indexMap[Sc[h]] = indexMap[Sc[h]] + 1;
        }
        for (int i = 0; i < J.length(); i++) {
            char a = Jc[i];
            result = result + indexMap[a];
        }
        return result;
    }
    public static void main(String[] args) {
        numJewelsInStones("aA","aAAbbbb");
    }
}
