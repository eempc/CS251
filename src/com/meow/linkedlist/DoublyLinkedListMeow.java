package com.meow.linkedlist;

import com.meow.circularLL.NodeMeow;
import org.w3c.dom.Node;

public class DoublyLinkedListMeow<E> {
    // Usually 2 Sentinel nodes
    // If 1 sentinel node, it can be a circular
    private NodeKitten<E> head;
    private NodeKitten<E> tail;
    private int size = 0;

    // Minimum of 2 nodes
    public DoublyLinkedListMeow() {
        head = new NodeKitten<>(null, null, null);
        tail = new NodeKitten<>(null, head, null);
        head.setNext(tail);
    }

    public DoublyLinkedListMeow(NodeKitten<E> head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int countSize() {
        NodeKitten k = head;
        if (k == null) {
            return 0;
        }

        int x = 1;
        while (k.next != null) {
            x++;
            k = k.next;
        }
        return x;
    }

    // first and last should be Theta(1) access
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getNext().getElement();
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

    public void insertAfter(NodeKitten targetNode, NodeKitten newNode) {
        newNode.prev = targetNode;
        // Inserting it as last
        if (targetNode.next == null) {
            newNode.next = null;
            // then set last node as newNode
            // setLast = newNode; // Use sentinel node?
        } else {
            newNode.next = targetNode.next;
            targetNode.next.prev = newNode;
        }
        targetNode.next = newNode;
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
            this.prev = prev;
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
