package com.meow.meowlist;

public interface ListADT<E> {
    int size();
    boolean isEmpty();
    E get(int i);
    E set(int i, E e);
    void add(int i, E e); // same as set
    E remove(int i);
}
