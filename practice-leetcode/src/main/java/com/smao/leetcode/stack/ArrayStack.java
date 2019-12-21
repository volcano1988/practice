package com.smao.leetcode.stack;

/**
 * 数组式链表
 */
public class ArrayStack {
    private String[] arrayStack;
    private int size;//栈中元素个数
    private int count;//栈的容量

    public ArrayStack(int count) {
        this.arrayStack = new String[count];
        this.count = count;
        this.size = 0;
    }

    public boolean push(String item){
        if(this.count == this.size){
            String[] arrayStackNew = new String[this.count*2];
            for(int i=0;i<arrayStack.length;i++){
                arrayStackNew[i] = arrayStack[i];
                this.count = this.count*2;
            }
            this.arrayStack = arrayStackNew;
        }
        arrayStack[this.size] = item;
        this.size++;
        return true;
    }

    public String pop(){
        if(this.size==0){
            return null;
        }
        String temp = arrayStack[size-1];
        size--;
        return temp;
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        arrayStack.push("4");
        arrayStack.push("5");
        System.out.println(arrayStack.size);
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        arrayStack.push("4");
        arrayStack.push("5");
        arrayStack.push("5");
        arrayStack.pop();
        System.out.println(arrayStack.size);
    }
}
