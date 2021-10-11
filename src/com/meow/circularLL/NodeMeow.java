package com.meow.circularLL;

public class NodeMeow<E> {
    private E element;
    private NodeMeow<E> next;

    public NodeMeow(E element, NodeMeow<E> next) {
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E e) {
        this.element = e;
    }

    public NodeMeow<E> getNext() {
        return next;
    }

    public void setNext(NodeMeow<E> n) {
        this.next = n;
    }
}
