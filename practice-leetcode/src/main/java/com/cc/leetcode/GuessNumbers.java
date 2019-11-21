package com.cc.leetcode;

/**
 * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。
 * <p>
 * 他们一共进行三次这个游戏，请返回 小A 猜对了几次？   
 * 输入的
 * guess数组为  小A 每次的猜测，
 * answer数组为 小B 每次的选择。
 * guess和answer的长度都等于3
 * <p>
 * 来源：力扣（LeetCode）
 * <p>
 * 链接：https://leetcode-cn.com/problems/guess-numbers 著作权归领扣网络所有。
 * 商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @create 2019-11-21
 */
public class GuessNumbers {

    public int game(int[] guess, int[] answer) {
        int x = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]){
                x++;
            }
        }
        return x;
    }

}
