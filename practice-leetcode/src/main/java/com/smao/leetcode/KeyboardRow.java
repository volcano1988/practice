package com.smao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 *
 *
 * 示例：
 *
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *  
 *
 * 注意：
 *
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/keyboard-row
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class KeyboardRow {
    static String[] row = {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int pre = 0;
            boolean flag = true;
            for(int j=0;j<words[i].length();j++){
                if(j==0){
                    if(row[0].indexOf((words[i].charAt(0))+"")>=0){
                        pre = 0;
                        continue;
                    }else if(row[1].indexOf((words[i].charAt(0))+"")>=0){
                        pre = 1;
                        continue;
                    }else if(row[2].indexOf((words[i].charAt(0))+"")>=0){
                        pre = 2;
                        continue;
                    }
                }
                if(row[pre].indexOf((words[i].charAt(j))+"")<0){
                    flag = false;
                }
            }
            if(flag){
                list.add(words[i]);
            }
        }
        String[] array = new String[list.size()];
        for(int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"adsdf","sfd"})));
        System.out.println((int)'a');
        System.out.println((int)'A');
    }
}
