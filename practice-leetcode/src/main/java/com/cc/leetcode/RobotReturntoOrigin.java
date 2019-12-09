package com.cc.leetcode;

/**
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
 * <p>
 * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。
 * 机器人的有效动作有 R（右），L（左），U（上）和 D（下）。
 * 如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 * <p>
 * 注意：机器人“面朝”的方向无关紧要。
 * “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。
 * 此外，假设每次移动机器人的移动幅度相同。
 * <p>
 * <p>
 * 输入: "UD"
 * 输出: true
 * 解释：机器人向上移动一次，然后向下移动一次。所有动作都具有相同的幅度，因此它最终回到它开始的原点。因此，我们返回 true。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/robot-return-to-origin
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author cuilongcan
 * @create 2019/3/26
 * <p>
 * R == 82
 * L == 76
 * U == 85
 * D == 68
 */
public class RobotReturntoOrigin {
    public boolean judgeCircle(String moves) {
        int i = 0;
        int j = 0;
        char[] chars = moves.toCharArray();
        for (int m = 0; m < chars.length; m++) {
            if (chars[m] == 'R') {
                i++;
            }
            if (chars[m] == 'L') {
                i--;
            }
            if (chars[m] == 'U') {
                j++;
            }
            if (chars[m] == 'D') {
                j--;
            }
        }
        if (i == j & j == 0) {
            return true;
        }
        return false;
    }

    public boolean judgeCircle1(String moves) {
        char[] chars = moves.toCharArray();
        int y = 0;
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 82) {
                x++;
            }
            if (chars[i] == 76) {
                x--;
            }
            if (chars[i] == 85) {
                y++;
            }
            if (chars[i] == 68) {
                y--;
            }
        }
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new RobotReturntoOrigin().judgeCircle("RL"));
    }
}
