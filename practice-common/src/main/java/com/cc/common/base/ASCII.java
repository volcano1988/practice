package com.cc.common.base;

/**
 * 记录打印ascii码表
 * 二进制范围 0010 0000
 * 十进制码范围 32 - 126
 * 十六进制范围 20 - 7E
 *
 * @author cuilongcan
 * @create 2019-12-02
 */
public class ASCII {
    public static void main(String[] args) {
        printAsciiDecimal();
    }

    private static void printAsciiDecimal() {
        for (int i = 32; i < 127; i++) {
            System.out.println((char) i + " == " + i);
        }
    }

    private static void printAsciiBinary(){

    }
}
