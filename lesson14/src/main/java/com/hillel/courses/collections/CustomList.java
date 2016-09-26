package com.hillel.courses.collections;

import java.util.Iterator;

public interface CustomList<E> {

    int size();
    boolean isEmpty();
    boolean contains(String element);
    boolean add(String element);
    void add(int index, String element);
    boolean remove(String element);
    String remove(int index);
    void clear();
    String get(int index);
    String get(int index, String element);
    int indexOf(String element);

    Iterator listIterator();
    Iterator backwardIterator();
    Iterator randomIterator();

}
