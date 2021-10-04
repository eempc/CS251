package com.meow.miau;

import com.meow.shapes.Circle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Enter radius");
//        Scanner s = new Scanner(System.in);
//        double r = s.nextDouble();
//
//        Circle c = new Circle(r);
//        System.out.println(c.toString());
//        System.out.println("Meow area: " + c.getArea());

            BirthdayParadox b = new BirthdayParadox(10000000, 23, 365);
            b.simulate();


    }
}
