package com.meow.meowstack;

public class ArrayStack<E> implements StackADT<E> {
    private E[] data;
    private int size;
    private static int capacity = 5;
    private int top; // keep track of the top index

    public ArrayStack() {
        this(capacity);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
        this.capacity = capacity;
        top = -1;
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E elementToReturn = data[top];
        data[top] = null;
        top--;
        return elementToReturn;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return data[top];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void push(E element) throws IllegalStateException {
        if (size() == data.length) {
            throw new IllegalStateException("Stack full"); // Because it is array
        }
        data[++top] = element; // ++top is increment before usage
    }


}
