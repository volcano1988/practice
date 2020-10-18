package com.practice.juc.thread;

/**
 * 线程的run,start方法对比
 * 继承thread
 * 1.重写run方法，对比start方法执行结果。start为线程并行执行方式
 *
 */
public class ThreadExample2 {

    private static class T1 extends Thread {
        @Override
        public void run() {
            System.out.println("this is t1");
        }
    }

    private static void test1() {
        for (int i = 0; i < 20; i++) {
            T1 t1 = new T1();
            t1.run();
            System.out.println("this is main!");
        }
    }

    private static void test2() {
        for (int i = 0; i < 20; i++) {
            T1 t1 = new T1();
            t1.start();
            System.out.println("this is main!");
        }
    }

    public static void main(String[] args) {
        test1();
        System.out.println("===================");
        test2();

    }
}
