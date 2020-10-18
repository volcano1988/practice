package com.practice.juc.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * java对象布局，工具包
 */
public class JolExample1 {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseClass(o.getClass()).toPrintable());
    }
}
