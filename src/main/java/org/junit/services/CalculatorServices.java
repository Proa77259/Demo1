package org.junit.services;

public class CalculatorServices {

    public static int addTwoNumber(int a, int b) {
        return a + b;
    }

    public static int prodcutTwoNumber(int a, int b) {
        return a * b;
    }

    public static double divideTwoNumber(int a, int b) {
        return a / b;
    }

    public static int sumTwoNumber(int... numbers) {

        int s = 0;
        for (int n : numbers) {
            s += n;

        }
        return s;
    }

}
