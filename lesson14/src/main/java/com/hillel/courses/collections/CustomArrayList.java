package com.hillel.courses.collections;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayList implements CustomList {

    public static final int SIZE = 10;

    private String[] array;
    private int size = 0;

    public CustomArrayList() {
        //this(SIZE);
        array = new String[SIZE];
    }

    public CustomArrayList(int size) {
        array = new String[size];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(String element) {
        return false;
    }

    public boolean add(String element) {
        if (size >= array.length)
            resizeArray();

        array[size] = element;
        size++;

        return true;
    }

    private void resizeArray() {
        String[] arrayExt = new String[array.length * 2];
        for (int i = 0; i < size; i++) {
            arrayExt[i] = array[i];
        }
        array = arrayExt;
    }

    public void add(int index, String element) {

    }

    public boolean remove(String element) {
        return false;
    }

    public String remove(int index) {
        return null;
    }

    public void clear() {

    }

    public String get(int index) {
        return null;
    }

    public String get(int index, String element) {
        return null;
    }

    public int indexOf(String element) {
        return 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            if (i != 0)
                result += ", ";
            result += array[i];
        }
        result += "]";
        return result;
    }

    @Override
    public Iterator listIterator() {
        return new ListIterator();
    }

    @Override
    public Iterator backwardIterator() {
        return new BackwardIterator();
    }

    @Override
    public Iterator randomIterator() {
        return null;
    }

    private class ListIterator implements Iterator {

        int current = 0;

        public boolean hasNext() {
            return current < size;
        }

        public Object next() {
            String element = array[current];
            current++;
            return element;
        }
    }

    private class BackwardIterator implements Iterator {

        int current = size - 1;

        @Override
        public boolean hasNext() {
            return current >= 0;
        }

        @Override
        public Object next() {
            String element = array[current];
            current--;
            return element;
        }
    }


}
