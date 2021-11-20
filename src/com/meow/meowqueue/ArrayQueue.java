package com.meow.meowqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements QueueADT<E> {
    private List<E> queue;

    public ArrayQueue() {
        queue = new ArrayList<>();
    }


    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(E element) {
        queue.add(element); // to end
    }

    @Override
    public E dequeue(E element) {
        if (isEmpty()) throw new NoSuchElementException();
        return queue.remove(0);
    }

    @Override
    public E peek() {
        return queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
