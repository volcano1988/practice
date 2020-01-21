package com.cc.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * <p>
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * <p>
 * 还有，自除数不允许包含 0 。
 * <p>
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/self-dividing-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author cuilongcan
 * @create 2019-12-11
 */
// todo
public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int j = left; j <= right; j++) {
            String s = left + "";
            int m =0;
            for (int i = 0; i < s.length(); i++) {
                Integer c = Integer.valueOf(String.valueOf(s.charAt(i)));
                if (left % c != 0) {
                    m++;
                }

            }
            if (m==0){

            list.add(left);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        selfDividingNumbers(111, 111);
    }
}
