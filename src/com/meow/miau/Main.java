package com.meow.miau;

import com.meow.algorithmstuff.Algorithm;
import com.meow.algorithmstuff.KittyCat;
import com.meow.algorithmstuff.MeowBubbleSort;
import com.meow.algorithmstuff.MeowQuickSort;
import com.meow.circularLL.CircularlyLinkedListMeow;
import com.meow.linkedlist.NodeCat;
import com.meow.linkedlist.SingularlyLinkedListMeow;
import com.meow.shapes.Circle;
import com.meow.shapes.Cylinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Queue<String> meow = new Queue<String>(); you can no longer do this
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

        int[] meowww = {1, 50, 500, 5000, 50000, 500000 };

        for (int kitty : meowww) {
            long start = System.nanoTime();
            KittyCat.kittens(kitty);
            long end = System.nanoTime();
            long diff = end - start;
            System.out.println(kitty + ": " + diff + " ns");
        }

        System.out.println("QUick sort");

        List<Integer> cats = new ArrayList<>(Arrays.asList(5, 1, 33, 21, 66, 432, 22, 99, 00));

        cats = KittyCat.kittyQuickSort(cats, 0, cats.size()-1);

        for (int ccc : cats) {
            System.out.println(ccc);
        }

        System.out.println("----------------");

        List<Algorithm> algos = new ArrayList<>();
        algos.add(new MeowBubbleSort());
        algos.add(new MeowQuickSort());

        for (Algorithm a : algos) {
            for (int i = 0; i < 10; i++) {
                long start = System.nanoTime();
                a.run(KittyCat.initList());
                long end = System.nanoTime();
                long diff = end - start;
                System.out.println(a.name() + ": " + diff + " ns");
            }
        }

    }
}
