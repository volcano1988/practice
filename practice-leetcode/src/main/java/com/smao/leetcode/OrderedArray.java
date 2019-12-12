package com.smao.leetcode;

/**
 * 实现一个大小固定的有序数组，支持动态增删改操作
 */
public class OrderedArray {
    public int[] orderedArray;
    public int size;
    public int init_size=8;

    public OrderedArray() {
        this.size = 0;
        this.orderedArray = new int[init_size];
    }

    public void delete(int index){
        if(index==this.orderedArray.length){
            return;
        }
        for(int i=index;i<this.orderedArray.length-1;i++){
            this.orderedArray[i] = this.orderedArray[i+1];
        }
        this.size--;
    }

    public void insert(int num){
        if(this.size == this.orderedArray.length){
            int[] newOrderedArray = new int[size*2];
            for(int i=0;i<this.orderedArray.length;i++){
                newOrderedArray[i] = orderedArray[i];
            }
            this.orderedArray = newOrderedArray;
        }
        this.orderedArray[this.size++] = num;
    }

    public void modify(int num,int index){
        this.orderedArray[index] = num;
    }

    public static void main(String[] args) {
        OrderedArray orderedArray = new OrderedArray();
        orderedArray.insert(1);
        orderedArray.insert(2);
        orderedArray.insert(3);
        orderedArray.insert(4);
        orderedArray.delete(1);
        orderedArray.modify(5,1);
        System.out.print(111);
    }
}
