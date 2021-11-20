package com.meow.meowstack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<E> implements StackADT<E> {
    private List<E> cat;
    private int size;
//    private int top; // top has been disabled for not being used in Damien's example, but might be better to use for O(1) access

    public ArrayListStack() {
        cat = new ArrayList<>();
//        top = -1;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
//        top--;
        return cat.remove(cat.size() - 1);
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return cat.get(cat.size() - 1);
    }

    @Override
    public int size() {
        return cat.size();
    }

    @Override
    public boolean isEmpty() {
        return cat.isEmpty();
    }

    @Override
    public void push(E element) {
//        top++;
        cat.add(element);
    }
}
