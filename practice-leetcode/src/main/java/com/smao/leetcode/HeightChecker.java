package com.smao.leetcode;

import java.util.Arrays;

/**
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 *
 * 请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
 *
 *  
 *
 * 示例：
 *
 * 输入：[1,1,4,2,1,3]
 * 输出：3
 * 解释：
 * 高度为 4、3 和最后一个 1 的学生，没有站在正确的位置。111234 114213
 *  
 *
 * 提示：
 *
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 *
 * 链接：https://leetcode-cn.com/problems/height-checker
 */
public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] temp = new int[heights.length];
        System.arraycopy(heights,0,temp,0,heights.length);
        int num = 0;
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(heights[i]==temp[i]){
                continue;
            }else{
                num++;
            }
        }
        return num;
    }
    public static int heightChecker2(int[] heights) {
        // 值的范围是1 <= heights[i] <= 100，因此需要1,2,3,...,99,100，共101个桶
        int[] arr = new int[101];
        // 遍历数组heights，计算每个桶中有多少个元素，也就是数组heights中有多少个1，多少个2，。。。，多少个100
        // 将这101个桶中的元素，一个一个桶地取出来，元素就是有序的
        for (int height : heights) {
            arr[height]++;
        }

        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            // arr[i]，i就是桶中存放的元素的值，arr[i]是元素的个数
            // arr[i]-- 就是每次取出一个，一直取到没有元素，成为空桶
            while (arr[i]-- > 0) {
                // 从桶中取出元素时，元素的排列顺序就是非递减的，然后与heights中的元素比较，如果不同，计算器就加1
                if (heights[j++] != i) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print(heightChecker2(new int[]{1,1,4,2,1,3}));
    }
}
