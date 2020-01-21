package com.common;

/**
 * @author cuilongcan
 * @create 2020-01-09
 */
public class CustomFunctionImplement implements CustomFunction {
    @Override
    public int f(int x, int y) {
        double random = Math.random();
        if (random > 0.5) {
            return x + y;
        } else {
            return x * y;
        }
    }

    public static void main(String[] args) {
        new CustomFunctionImplement().f(1, 2);
    }
}
