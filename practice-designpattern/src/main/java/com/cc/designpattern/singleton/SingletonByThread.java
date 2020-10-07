package com.cc.designpattern.singleton;

/**
 * 考虑到线程安全的写法
 */
public class SingletonByThread {
    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static SingletonByThread sbt = null;

    private SingletonByThread() {
    }

    /**
     * 对实例化方法加锁的目的是为了保证线程安全，但是在方法入口加锁相当于synchronized的this，
     * 该方式会降低创建效率
     *
     * @return
     */
    public static SingletonByThread getSbt() {
        synchronized (SingletonByThread.class) {
            if (sbt == null) {
                sbt = new SingletonByThread();
            }
        }
        return sbt;
    }
}
