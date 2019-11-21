package com.cc.designpattern;

/**
 * 线程同步和效率兼并的singleton
 *
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019-11-21
 */
public class SingletonByThread2 {
    private static volatile SingletonByThread2 sbt = null;

    private SingletonByThread2() {

    }

    public static SingletonByThread2 getSbt() {
        if (sbt == null) {
            synchronized (SingletonByThread2.class) {
                if (sbt == null) {
                    sbt = new SingletonByThread2();
                }
            }
        }
        return sbt;
    }
}
