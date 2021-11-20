package com.meow.meowqueue;

public interface CircularQueueADT<E> extends QueueADT<E> {
    void rotate();
}
