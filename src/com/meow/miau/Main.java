package com.meow.miau;

import com.meow.shapes.Circle;
import com.meow.shapes.Cylinder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter radius");
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();

        Circle c = new Circle(r);
        System.out.println(c.toString());
        System.out.println("Meow area: " + c.getArea());
        System.out.println(c.getPerimeter());
        c.setFilled(true);

        Cylinder cyl = new Cylinder(r, 10);
        System.out.println(cyl.getPerimeter());
        System.out.println(c.getFilled());


        BirthdayParadox b = new BirthdayParadox(1000, 23, 365);
        b.simulate();
        System.out.println(b.probability1());

    }
}
