package com.cc.common.utils;

/**
 * 数字转换工具
 *
 * @author cuilongcan
 * @create 2019-12-02
 */
public class NumericalTransfer {

    public String decimalToBinary(int i) {
        StringBuilder s = new StringBuilder();
        int m = i % 2;
        int n = i / 2;
        while (n > 1) {
            s.append(m);
        }
        return s.toString();

    }

}
