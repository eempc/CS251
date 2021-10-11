package com.meow.linkedlist;

public class SingularlyLinkedListMeow implements Cloneable {
    private NodeCat head;
    private static int size;

    public static SingularlyLinkedListMeow insert(SingularlyLinkedListMeow list, int x) {
        NodeCat newNodeCat = new NodeCat(x);
        newNodeCat.next = null;

        if (list.head == null) {
            list.head = newNodeCat;
        } else {
            NodeCat last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNodeCat;
        }
        size++;
        return list;
    }

    public int countSize() {
        NodeCat n = head;
        if (n == null) {
            return 0;
        }

        int x = 1;

        while (n.next != null) {
            x++;
            n = n.next;
        }
        return x;
    }

    public static void printList(SingularlyLinkedListMeow list) {
        NodeCat currentNodeCat = list.head;
        while (currentNodeCat != null) {
            System.out.println(currentNodeCat.data + " ");
            currentNodeCat = currentNodeCat.next;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) {
            return false;
        }

        SingularlyLinkedListMeow other = (SingularlyLinkedListMeow) o;

        if (size != other.size) {
            return false;
        }

        NodeCat nodeCatA = head;
        NodeCat nodeCatB = other.head;

        // QUick method that doesn't use getters
        while (nodeCatA != null) {
            if (nodeCatA.data != nodeCatB.data) {
                return false;
            }

            nodeCatA = nodeCatA.next;
            nodeCatB = nodeCatB.next;
        }

        return true;
    }

    public SingularlyLinkedListMeow clone() throws CloneNotSupportedException {
        SingularlyLinkedListMeow other = (SingularlyLinkedListMeow) super.clone();

        if (size > 0) {
            other.head = new NodeCat(head.data);
            NodeCat nodeCatA = head.next;
            NodeCat otherNodeCat = other.head;
            while (nodeCatA != null) {
                NodeCat newest = new NodeCat(nodeCatA.data);
                otherNodeCat.next = newest;
                nodeCatA = nodeCatA.next;
            }
        }

        return other;
    }

    // Static inner class
    static class NodeCat {
        int data;
        NodeCat next;

        // Constructor
        NodeCat(int d) {
            data = d;
            next = null;
        }
    }
}
