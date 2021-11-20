package com.meow.positional;

public interface Position<E> {
    E getElement() throws IllegalStateException;
}
