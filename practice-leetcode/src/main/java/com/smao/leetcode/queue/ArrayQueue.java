package com.smao.leetcode.queue;

/**
 * 用数组实现一个队列
 */
public class ArrayQueue {
    private String[] queue;
    private int head;
    private int tail;
    private int n;

    public ArrayQueue(int count) {
        this.queue = new String[count];
        n = count;
    }
    public boolean push(String num){
        if(n==tail){
            if(head==0){
                return false;
            }
            for(int i=head;i<tail;++i){
                queue[i-head] = queue[i];
            }
            head = 0;
            tail-=head;
        }
        queue[tail] = num;
        ++tail;
        return true;
    }
    public String pop(){
        if(head==tail){
            return null;
        }
        String item = queue[head];
        ++head;
        return item;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(10);
        arrayQueue.push("1");
        System.out.println(arrayQueue.pop());
        arrayQueue.push("2");
        System.out.println(arrayQueue.pop());
        arrayQueue.push("3");
        System.out.println(arrayQueue.pop());
        arrayQueue.push("4");
        System.out.println(arrayQueue.pop());
        arrayQueue.push("5");
        arrayQueue.push("1");
        arrayQueue.push("2");
        arrayQueue.push("3");
        arrayQueue.push("4");
        arrayQueue.push("5");
        arrayQueue.push("5");
    }
}
