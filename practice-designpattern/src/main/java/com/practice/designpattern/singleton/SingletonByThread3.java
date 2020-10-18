package com.practice.designpattern.singleton;

/**
 * 线程同步和效率兼并的singleton
 *
 */
public class SingletonByThread3 {

    /**
     * 该处与SingletonByThread2对比增加了volatile关键字
     * 是为了防止cpu指令重排
     * 因为在 sbt = new SingletonByThread3();
     * 语句执行时，cpu指令分为三步
     * 1.为该对象申请内存
     * 2.为该对象成员初始化
     * 3.把该内存赋值给该对象
     *
     */
    private static volatile SingletonByThread3 sbt = null;

    private SingletonByThread3() {

    }

    /**
     * double check lock
     *
     * @return
     */
    public static SingletonByThread3 getSbt() {
        if (sbt == null) {
            synchronized (SingletonByThread3.class) {
                if (sbt == null) {
                    sbt = new SingletonByThread3();
                }
            }
        }
        return sbt;
    }
}
