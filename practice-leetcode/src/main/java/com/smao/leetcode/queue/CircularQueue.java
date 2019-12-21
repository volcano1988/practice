package com.smao.leetcode.queue;

/**
 * 循环队列
 */
public class CircularQueue {
    public String[] item;
    public int head;
    public int tail;
    public int n;

    public CircularQueue(int count) {
        this.n = count;
        item = new String[count];
    }

    public boolean push(String str){
        if((tail+1)%n == head){
            return false;
        }
        item[tail] = str;
        tail = (tail+1)%n;
        return true;
    }

    public String pop(){
        if(head == tail){
            return null;
        }
        String str = item[head];
        head = (head+1)%n;
        return str;
    }
}
