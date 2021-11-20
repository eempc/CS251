package com.meow.meowlist;

import java.util.NoSuchElementException;

public class MeowArrayList<E> implements ListADT<E> {
    public static final int CAPACITY = 5;
    private E[] list;
    public int size;

    public MeowArrayList(int capacity) {
        list = (E[]) new Object[capacity];
        size = 0;
    }

    public MeowArrayList() {
        this(CAPACITY);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int i) {
        if (isEmpty()) {
            throw new NoSuchElementException("empty");
        }
        return list[i];
    }

    @Override
    public E set(int i, E e) {
        checkIndex(i, size);
        E temp = list[i];
        list[i] = e;
        return temp;
    }

    private void checkIndex(int i , int size) {
        if (i < 0 || i >= CAPACITY) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
    }

    @Override
    public void add(int i, E e) {
        checkIndex(i, size);
        if (size == list.length) {
            throw new IllegalStateException("full");
        }
        for (int k = size()-1; k >= i; k--) {
            list[k + 1] = list[k]; // shifting right
        }
        list[i] = e; // Am I missing something?
        size++;
    }

    @Override
    public E remove(int i) {
        checkIndex(i, size);
        E temp = list[i];
        for (int k = i; k < size() - 1; k++) {
            list[k] = list[k+1];
        }
        list[size-1] = null;
        size--;
        return temp;
    }
}
