package com.practice.designpattern.singleton;

/**
 * 线程同步和效率兼并的singleton
 */
public class SingletonByThread2 {

    private static SingletonByThread2 sbt = null;

    private SingletonByThread2() {
    }

    /**
     * double check lock
     * 双重检查是兼顾效率与线程安全的有效措施
     *
     * @return
     */
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

    /**
     * 该实验证明再高并发时，上述单例方法依然成立，但是特殊情况会使该方法失效
     * 即，cpu指令重排
     * 详见SingletonByThread3
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            SingletonByThread3 sbt = SingletonByThread3.getSbt();
            System.out.println(sbt.hashCode());
        }
    }
}
