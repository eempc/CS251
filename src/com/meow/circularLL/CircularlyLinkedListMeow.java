package com.meow.circularLL;

public class CircularlyLinkedListMeow<E> {
    private NodeMeow<E> tail = null;
    private int size = 0;

    public CircularlyLinkedListMeow() {
    }

    public int size() {
        return size;
    }

    public int countSize() {
        if (tail == null) {
            return 0;
        }

        if (tail.getNext() == null) {
            return 1;
        }

        int x = 1;
        NodeMeow startNode = tail;
        NodeMeow tempNode = tail.getNext();

        while (tempNode != startNode) {
            x++;
            tempNode = tempNode.getNext();
        }

        return x;
    }

    public NodeMeow<E> getTail() {
        return tail;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E e) {
        if (isEmpty()) {
            tail = new NodeMeow<>(e, null);
            tail.setNext(tail);
        } else {
            NodeMeow<E> newest = new NodeMeow<>(e,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        NodeMeow<E> head = tail.getNext();

        // if is same
        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }
}
