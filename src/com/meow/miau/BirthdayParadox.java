package com.meow.miau;
/*
1. Consider the logic of the program and create a Word document that shows your logic either, this can be in any form that suits you provided it is easily understood. You can use a form of structured English, more formal pseudocode or a diagram.

2. Create a Java program to implement your solution to the problem. This should contain an appropraite class with constructor and all required methods to fully implement the required functionality.

The birthday paradox says that the probability that two people in a room will have the same birthday is more than half, provided n, the number of people in the room, is more than 23. This property is not really a paradox, but many people find it surprising. Design a Java program that can test this paradox by a series of experiments on randomly generated birthdays, which test this paradox for n = 5,10,15,20,...,100.
 */

// Assuming no leap year birthdays

// Option 1 - simulate a room with random people of n number as is the problem, repeat this again and again (i.e. brute-force)
// Option 2 - generate birthdays randomly, add them to ArrayList, if it matches any of the previous entries, add to yes count and stop, if you reach N, stop and add to no count. keep running for a long time and see if it holds true
// Option 3 - calculate mathematically, this one could probably be googled way too easily
// If 2 people = 1/365
// If 3 people = etc...
// https://math.stackexchange.com/questions/2432377/probability-for-someone-in-room-having-same-name-as-someone-else-in-the-room
//https://math.stackexchange.com/questions/2431094/probability-for-first-person-in-room-having-same-name-as-someone-else-in-the-roo
// Although this doesn't answer your question, here is an alternative approach. You can think of the solution as the probability that none of them have the same name, which is
//
//1−(1112⋅1012⋅…⋅612)
//
//If Rumpelstiltskin is one of the names given to one of the 7
//people, then none of the other people can be named Rumpelstiltskin, which leaves 11 out of 12 names we can assign for our second choice. If Jerry is one of the names we can give, and we end up naming someone Jerry, then the next name we assign cannot be Jerry and it also cannot be Rumpelstiltskin. This leaves 10 out of 12 names for assignment and so on and so forth.

// What is the probability that nobody in the room has the same name?
// Assume all names have the same equal chance of happening, same as an equal distribution of birthdays (not including the leap year)

// Possible birthdays = 365
// Number of people in the room = 20

import java.util.ArrayList;
import java.util.Random;

public class BirthdayParadox {
    private int rooms; // Number of rooms, how many rooms you want to simulate
    private int n; // Number of people per room, i.e. 23
    private int possibilities; // Number of possible birthdays, i.e. 365

    private Random r;

    public BirthdayParadox(int rooms, int n, int possibilities) {
        this.rooms = rooms;
        this.n = n;
        this.possibilities = possibilities;
        r = new Random();
    }

    public void simulate() {
        int yesCount = 0;
        int noCount = 0;

        for (int i = 0; i < rooms; i++) {
            ArrayList<Integer> existing = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int next = r.nextInt(possibilities);
//                System.out.println(next);
                if (existing.contains(next)) {
                    noCount++;
                    break;
                } else {
                    existing.add(next);
                }

                if (j == n - 1) {
                    yesCount++;
                }
            }
        }

        System.out.println("Yes, all unique birthdays " + yesCount);
        System.out.println("No, some matching birthdays " + noCount);
    }



    public double probability(int possibilities, int x) {
        double temp = 1;
        for (int i = possibilities - 1; i >= x - 1; i--) {

            temp *= (double)i/(double)possibilities;
            System.out.println("Current: " + i + "; current temp: " + temp);
        }

        return (double)1 - temp;
    }

}
