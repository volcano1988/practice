package com.cc.leetcode;

import java.util.*;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-common-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author cuilongcan
 * @create 2020-01-20
 */
public class FindCommonCharacters {

    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        char[] chars = A[0].toCharArray();
        for (char aChar : chars) {
            Integer integer = map.get(String.valueOf(aChar));
            if (integer != null) {
                map.put(String.valueOf(aChar), ++integer);
            } else {
                map.put(String.valueOf(aChar), 1);
            }
        }
        for (int i = 1; i < A.length; i++) {
            Map<String, Integer> element = new HashMap<>(map);
            char[] chars1 = A[i].toCharArray();
            for (int j = 0; j < chars1.length; j++) {
                Integer e = element.get(String.valueOf(chars1[j]));
                if (e != null && e != 0) {
                    element.put(String.valueOf(chars1[j]), --e);
                }
            }
            for (String s : element.keySet()) {
                if (element.get(s) != 0) {
                    map.put(s, element.get(s));
                }
            }

        }
        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                for (int i = 0; i < map.get(s); i++) {
                list.add(s);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String [] A = {"bella","label","roller"};
        new FindCommonCharacters().commonChars(A);
    }
}
