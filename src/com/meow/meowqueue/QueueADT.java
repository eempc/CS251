package com.meow.meowqueue;

public interface QueueADT<E> {
    int size();
    void enqueue(E element);
    E dequeue(E element);
    E peek(); // aka first();
    boolean isEmpty();
}
