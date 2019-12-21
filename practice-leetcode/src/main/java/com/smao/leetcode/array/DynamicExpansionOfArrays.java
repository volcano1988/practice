package com.smao.leetcode.array;

/**
 * 数组动态扩容
 */
public class DynamicExpansionOfArrays {
    public int init_size = 8;//初始大小
    public Object[] array;//数组
    public int size;//记录数组长度

    public DynamicExpansionOfArrays() {
        this.size = 0;
        this.array = new Object[init_size];
    }

    public void put(Object object) {
        if (this.size == array.length) {
            Object[] newArray = new Object[this.size * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[this.size++] = object;
    }
}
