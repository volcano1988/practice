package com.practice.juc.thread;

import java.util.concurrent.TimeUnit;

/**
 * 线程状态及方法总结
 * state
 * 1.new
 * 2.runnable ready、running
 * 3.terminal
 * method
 * 1.wait
 * 2.join
 * 3.interrupt
 */
public class ThreadState {
    /**
     * 使当前线程睡眠，其他线程可以被cpu执行
     */
    private static void testSleep() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("this is sleep " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.getStackTrace();
                }

            }
        }).start();
    }

    /**
     * 当前线程让出cpu调度器，使其他线程可以被调度。（当前线程依然参与竞争）
     */
    private static void testYeild() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("this is sleep " + i);
                Thread.yield();
            }
        }).start();
    }

    /**
     * 线程t2执行过程中，等待t1线程执行结束才会继续执行；
     */
    private static void testJoin() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("this is t1");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println("this is t2 a");
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("this is t2 b");

        });
        t1.start();
        t2.start();
    }

    /**
     * 测试线程的状态
     */
    private static void testState() {
        Thread t1 = new Thread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try {
            t1.join();
            System.out.println(t1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadState.testSleep();
        ThreadState.testYeild();
        ThreadState.testJoin();
        ThreadState.testState();
    }
}
