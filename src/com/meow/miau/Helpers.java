package com.meow.miau;

public class Helpers {
    public static int factorial(int x) {
        if (x <= 1) return 1;
        return x * factorial(x - 1);
    }

    public static int factorialWithMin(int x, int min) {
        if (x <= min) return min;
        return x * factorialWithMin(x - 1, min);
    }
}
