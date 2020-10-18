package com.practice.juc.lock;

/**
 * synchronized原理
 */
public class SynchronizedExample1 {
    synchronized void m1() {
        System.out.println("M1.....");
    }

    synchronized void m2() {
        System.out.println("M2.....");

    }

    synchronized void m3() {
        System.out.println("M3.....");
    }

    public static void main(String[] args) {

    }
}