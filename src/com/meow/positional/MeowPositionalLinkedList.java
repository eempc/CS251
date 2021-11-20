package com.meow.positional;

public class MeowPositionalLinkedList<E> implements PositionalListADT<E> {
    private MeowPNode<E> head;
    private MeowPNode<E> tail;
    private int size = 0;

    public MeowPositionalLinkedList() {
        // Are these sentinels? This is not a circular
        head = new MeowPNode<>(null, null, null);
        tail = new MeowPNode<>(null, head, null);
        head.setNext(tail);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    // Who is first in the list? You don't count the sentinels, so it's the one after the sentinel head
    // But what is the se
    @Override
    public Position first() {
        // Should I check head.getNext() isn't the tail? Or at the very minimum isEmpty();
        // Or the positionCheck method below?
        return positionCheck(head.getNext());
    }

    @Override
    public Position<E> last() {
        return positionCheck(tail.getPrev());
    }

    // Sentinel check
    private Position<E> positionCheck(MeowPNode<E> node) {
        if (node == head || node == tail) {
            return null;
        }
        return node;
    }

    // validate position is valid node or what
    private MeowPNode<E> validate(Position<E> p) {
        // Is position a node?
        if (!(p instanceof MeowPNode)) {
            throw new IllegalArgumentException("not valid node");
        }

        // next should be either another node or tail, if not this node is orphaned
        MeowPNode<E> node = (MeowPNode<E>) p;
        if (node.getNext() == null) {
            throw new IllegalArgumentException("position not in list");
        }

        return node;
    }

    // Get the node behind the position p you entered as parameter
    @Override
    public Position before(Position p) throws IllegalArgumentException {
        MeowPNode<E> node = validate(p);
        return positionCheck(node.getPrev());
    }

    @Override
    public Position after(Position p) throws IllegalArgumentException {
        MeowPNode<E> node = validate(p);
        return positionCheck(node.getNext());
    }

    @Override
    public Position<E> addFirst(E element) {
        return addBetween(element, head, head.getNext());
    }

    private Position<E> addBetween(E e, MeowPNode<E> head, MeowPNode<E> next) {
        MeowPNode<E> newest = new MeowPNode<>(e, head, next);
        head.setNext(newest);
        next.setPrev(newest);
        size++;
        return newest;
    }

    @Override
    public Position<E> addLast(E element) {
        return addBetween(element, tail.getPrev(), tail);
    }

    @Override
    public Position<E> addBefore(Position<E> position, E element) throws IllegalArgumentException {
        MeowPNode<E> node = validate(position);
        return addBetween(element, node.getPrev(), node);
    }

    @Override
    public Position<E> addAfter(Position<E> position, E element) throws IllegalArgumentException{
        MeowPNode<E> node = validate(position);
        return addBetween(element, node, node.getNext());
    }

    @Override
    public E set(Position<E> position, E element) throws IllegalArgumentException {
        MeowPNode<E> node = validate(position);
        E temp = node.getElement();
        node.setElement(element);
        return temp;
    }

    @Override
    public E remove(Position<E> p) throws IllegalArgumentException {
        MeowPNode<E> node = validate(p);
        MeowPNode<E> predecessor = node.getPrev();
        MeowPNode<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        E temp = node.getElement();
        node.setElement(null); // garbage collector needs a null node
        node.setNext(null); // they don't pay me enough
        node.setPrev(null); // to prevent memory leaks
        return temp;
    }
}
