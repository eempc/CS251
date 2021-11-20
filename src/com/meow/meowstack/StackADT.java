package com.meow.meowstack;

public interface StackADT<E> {
    public E pop();
    public E top(); // aka peek
    int size();
    boolean isEmpty();
    void push(E element);
}
