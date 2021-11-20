package com.meow.meowDeque;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MeowDeque<E> implements DequeADT<E> {

    private List<E> deque;

    public MeowDeque() {
        deque = new ArrayList<>(); // ArrayList implementation, but can also be LinkedList
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public void addFirst(E e) {
        // https://stackoverflow.com/questions/12949690/java-arraylist-how-to-add-elements-at-the-beginning
        deque.add(0, e);
    }

    @Override
    public void addLast(E e) {
        deque.add(e);
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("empty");
        }
        return deque.remove(0);
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("empty");
        }
        return deque.remove(size()-1);
    }

    @Override
    public E first() {
        return deque.get(0);
    }

    @Override
    public E last() {
        return deque.get(size()-1);
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
