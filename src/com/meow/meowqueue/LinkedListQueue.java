package com.meow.meowqueue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

// Re-wiring a LL to become a Queue
public class LinkedListQueue<E> implements QueueADT<E> {
    private LinkedList<E> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(E element) {
        queue.add(element);
    }

    @Override
    public E dequeue(E element) {
        if (isEmpty()) throw new NoSuchElementException();
        return queue.removeFirst();
    }

    @Override
    public E peek() {
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
