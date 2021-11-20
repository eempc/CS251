package com.meow.meowstack;

import java.util.LinkedList;

public class LinkedListStack<E> implements StackADT<E> {
    private LinkedList<E> list;

    public LinkedListStack() {
        this.list = new LinkedList<>();
    }

    @Override
    public E pop() {
        return list.pop();
    }

    @Override
    public E top() {
        return list.peek();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E element) {
        list.push(element);
    }
}
