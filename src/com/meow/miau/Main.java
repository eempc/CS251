package com.meow.miau;

import com.meow.circularLL.CircularlyLinkedListMeow;
import com.meow.linkedlist.NodeCat;
import com.meow.linkedlist.SingularlyLinkedListMeow;
import com.meow.shapes.Circle;
import com.meow.shapes.Cylinder;

import java.util.Scanner;
import java.util.prefs.NodeChangeEvent;

public class Main {
    public static void main(String[] args) {
        SingularlyLinkedListMeow kittyCat = new SingularlyLinkedListMeow();
        kittyCat.addLast(new NodeCat(5));
        kittyCat.addLast(new NodeCat(4));
        kittyCat.addLast(new NodeCat(3));
        kittyCat.printList(kittyCat);
        kittyCat.rotate();
        kittyCat.printList(kittyCat);

        int[] aaaa = {1,2,3};
        int[] bbbb = aaaa.clone();
        System.out.println(aaaa == bbbb ? "Same Instance" : "Different Instance");
        bbbb[0] = 5;
        System.out.println(aaaa[0]);
        System.out.println(bbbb[0]);

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


        BirthdayParadox b = new BirthdayParadox(10, 23, 365);
        b.simulate();
        System.out.println(b.probability1());
        System.out.println("----------------");

        SingularlyLinkedListMeow meow = new SingularlyLinkedListMeow();
        System.out.println("new SLL size: " + meow.countSize());
        meow.insert(meow, 3);
        meow.insert(meow, 3);
        meow.insert(meow, 3);
        meow.insert(meow, 3);
        meow.printList(meow);
        System.out.println("new SLL size: " + meow.countSize());
        CircularlyLinkedListMeow<Integer> kitten = new CircularlyLinkedListMeow<>();

        System.out.println("kitten size: " + kitten.size());
        System.out.println("kitten size again " + kitten.countSize());

        kitten.addFirst(5);
        System.out.println("kitten size: " + kitten.size());
        System.out.println("kitten size again " + kitten.countSize());
        kitten.addFirst(5);
        System.out.println("kitten size: " + kitten.size());
        System.out.println("kitten size again " + kitten.countSize());
    }
}
