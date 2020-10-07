package com.cc.designpattern.singleton;

/**
 * 饿汉式
 *
 * 单例模式，是为了保证系统中只有一个实例
 * 1.这样做的好处是编写简单，第一次引用该类就创建了对象，但是无法做到延迟创建对象。
 * 2.我们很多时候都希望对象可以尽可能地延迟加载，从而减小负载
 *
 */

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);
    }
}
