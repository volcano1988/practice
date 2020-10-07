package com.cc.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * 保证线程可见性
 * MESI
 * 缓存一致性协议
 * 禁止指令重排序
 * DCL  Double Check Lock
 */
public class VolatileExample1 {

    public void testVolatile() {
        Thread t1 = new Thread("t1");

        Thread t2 = new Thread("t2");
        AtomicIntegerArray
    }
}
