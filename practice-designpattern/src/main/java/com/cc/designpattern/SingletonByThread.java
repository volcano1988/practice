package com.cc.designpattern;

/**
 * 考虑到线程安全的写法
 *
 * @author cuilongcan
 * @create 2019-11-21
 */
public class SingletonByThread {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     * 这里使用volatile来维持在多线程下即时可见性
     */

    private static volatile SingletonByThread sbt = null;

    private SingletonByThread() {
    }

    public static SingletonByThread getSbt() {
        synchronized (SingletonByThread.class) {
            if (sbt == null) {
                sbt = new SingletonByThread();
            }
        }
        return sbt;
    }
}
