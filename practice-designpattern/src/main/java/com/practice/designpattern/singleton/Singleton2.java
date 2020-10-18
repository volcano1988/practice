package com.practice.designpattern.singleton;

/**
 * 懒汉式
 * <p>
 * 考虑到效率问题
 */
public class Singleton2 {
    private static Singleton2 singleton = null;

    private Singleton2() {
    }

    public Singleton2 getSingleton2() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
