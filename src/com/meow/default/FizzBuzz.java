package com.company;

import java.util.Scanner;

public class FizzBuzz {
    private String fizz = "Fizz";
    private String buzz = "Buzz";
    private int limit;

    public FizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Limit please");
        limit = scanner.nextInt();
    }

    public void run() {
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + fizz + buzz);
            } else if (i % 3 == 0) {
                System.out.println(i + fizz);
            } else if (i % 5 == 0) {
                System.out.println(i + buzz);
            } else {
                System.out.println(i);
            }
        }
    }
}
