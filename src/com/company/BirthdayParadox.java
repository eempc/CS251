package com.company;
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


public class BirthdayParadox {
}
