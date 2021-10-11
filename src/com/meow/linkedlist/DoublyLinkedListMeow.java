package com.meow.linkedlist;

import com.meow.circularLL.NodeMeow;
import org.w3c.dom.Node;

public class DoublyLinkedListMeow<E> {
    private NodeKitten<E> head;
    private int size = 0;

    public DoublyLinkedListMeow() {
    }

    public DoublyLinkedListMeow(NodeKitten<E> head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int countSize() {

    }

    public void addFirst(E e) {
        if (isEmpty()) {
            head = new NodeKitten<>(e, null, null);
        } else {
            NodeKitten<E> kitten = new NodeKitten<>(e, head, null);
            head.setPrev(kitten);
            head = kitten;
        }
        size++;
    }

    public void addLast(E e) {
        if (isEmpty()) {
            addFirst(e);
        } else {
            NodeKitten<E> n = head.getNext();
            while (n.getNext() != null) {
                n.setNext(n);
            }

            NodeKitten newest = new NodeKitten(e, null, n);
            n.setNext(newest);
        }
    }

    static class NodeKitten<E> {
        private E element;
        NodeKitten<E> next;
        NodeKitten<E> prev;

        public NodeKitten() {
        }

        public NodeKitten(E element, NodeKitten<E> next, NodeKitten<E> prev) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public NodeKitten<E> getNext() {
            return next;
        }

        public void setNext(NodeKitten<E> next) {
            this.next = next;
        }

        public NodeKitten<E> getPrev() {
            return prev;
        }

        public void setPrev(NodeKitten<E> prev) {
            this.prev = prev;
        }
    }
}
