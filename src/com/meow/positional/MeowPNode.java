package com.meow.positional;

public class MeowPNode<E> implements Position<E> {
    private E element;
    private MeowPNode<E> next;
    private MeowPNode<E> prev;

    public MeowPNode(E element, MeowPNode<E> previous, MeowPNode<E> next) {
        this.element = element;
        this.prev = previous;
        this.next = next;
    }

    @Override
    public E getElement() throws IllegalStateException {
        if (next == null) {
            throw new IllegalStateException("next is not valid cat");
        }
        return element;
    }

    public MeowPNode<E> getPrev() {
        return prev;
    }

    public MeowPNode<E> getNext() {
        return next;
    }

    public void setElement(E e) {
        this.element = e;
    }

    public void setPrev(MeowPNode<E> p) {
        this.prev = p;
    }

    public void setNext(MeowPNode<E> n) {
        this.next = n;
    }
}
