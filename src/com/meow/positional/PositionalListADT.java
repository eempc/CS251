package com.meow.positional;


// Remember how in HackerRank you were inserting after a particular node, this is it

public interface PositionalListADT<E> {
    int size();
    boolean isEmpty();
    Position<E> first();
    Position<E> last();
    Position<E> before(Position<E> p) throws IllegalArgumentException;
    Position<E> after(Position<E> p) throws IllegalArgumentException;
    Position<E> addFirst(E element);
    Position<E> addLast(E element);
    Position<E> addBefore(Position<E> position, E element) throws IllegalArgumentException;
    Position<E> addAfter(Position<E> position, E element) throws IllegalArgumentException;
    E set(Position<E> position, E element);
    E remove(Position<E> p) throws IllegalArgumentException;
}
