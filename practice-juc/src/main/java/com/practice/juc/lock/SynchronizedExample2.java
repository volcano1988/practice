package com.practice.juc.lock;

/**
 * synchronized原理
 * 异常时会释放锁
 */
public class SynchronizedExample2 {
   static synchronized void m1() {
       for (int i = 0; i < 1000; i++) {
           System.out.println("this is m1"+ Thread.currentThread().getName());
           Integer j = null;
           System.out.println(j / 2);
           try {
               Thread.sleep(100000000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }

    private static class T extends Thread {
        @Override
        public void run() {
            SynchronizedExample2.m1();
        }
    }

    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        t1.setName("t1");
        t1.start();
        t2.setName("t2");
        t2.start();
    }
}