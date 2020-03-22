package com.cc.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 *
 * @create 2020-01-17
 */
public class ShortestDistancetoaCharacter {

    public int[] shortestToChar(String S, char C) {
        int[] x = new int [S.length()];
        char[] chars = S.toCharArray();
        List<Integer> pos = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==C) {
                pos.add(i);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == C) {
                x[i]=0;
            }else{
                int min = -1;
                for (Integer po : pos) {
                    int abs = Math.abs(i-po);
                    if (min ==-1){
                        min = abs;
                    }else{
                        min = Math.min(abs, min);
                    }
                }
                x[i]= min;
            }


        }
        return x;

    }

    public static void main(String[] args) {
        new ShortestDistancetoaCharacter().shortestToChar("loveleetcode", 'e');
    }
}
