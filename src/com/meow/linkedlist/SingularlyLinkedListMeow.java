package com.meow.linkedlist;

public class SingularlyLinkedListMeow implements Cloneable {
    private NodeCat head;
    private static int size;

    // Θ(n) adding onto the end, to a particular list, this is a reference to another list, not necessarily this one
    public static SingularlyLinkedListMeow insert(SingularlyLinkedListMeow list, int x) {
        NodeCat newNodeCat = new NodeCat(x);
        newNodeCat.next = null;

        if (list.head == null) {
            list.head = newNodeCat;
        } else {
            // You have to traverse until the end, calling it last wasn't the best idea
            NodeCat last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNodeCat;
        }
        size++;
        return list;
    }

    // Θ(n) Theta Tight bound
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

    // This is the proper insertion for this class
    public void addLast(NodeCat n) {
        NodeCat x = head;
        if (head == null) {
            head = n;
        } else {
            while (x.next != null) {
                x = x.next;
            }
            x.next = n;
        }
        size++;
    }

//    public void removeFirst() {
//        head = head.next;
//        // How to kill the unlinked Node? Automatic GC?
//    }

    public NodeCat removeFirst() {
        NodeCat temp = head;
        head = head.next;
        return temp; // or destroy it
    }

    // Rotate by creating new node
    public void rotate() {
        NodeCat newLast = head; // reference, not new NodeCat()
        addLast(newLast);
        head = head.next;
        newLast.next = null;
    }

    // Rotate by swapping data down the line? That's ridiculous!
    public void rotate2() {

    }

    // AddLast (head)
    // head = head.next
    // Traverse to the end until the currentNode.next is equal to head and set the current node's next to be null to break the circle
    public void rotate3() {
        addLast(removeFirst());
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

}
