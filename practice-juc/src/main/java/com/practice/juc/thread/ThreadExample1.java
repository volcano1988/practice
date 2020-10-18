package com.practice.juc.thread;

/**
 * 线程的两种建立方式
 */
public class ThreadExample1 {

    private static class T1 extends Thread {
        @Override
        public void run() {
            System.out.println("this is t1!");
        }
    }

    private static class T2 implements Runnable {
        @Override
        public void run() {
            System.out.println("this is t2!");
        }
    }

    public static void main(String[] args) {
            T1 t1  = new T1();
            t1.start();
            new Thread(new T2()).start();
    }
}
