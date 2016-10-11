package com.courses.linkedlists;

public class Stack {

    public static final int MAXIMUM_SIZE = 10;
    private int[] array;
    private int pointer;

    public Stack() {
        array = new int[MAXIMUM_SIZE];
        pointer = -1;
    }

    public void push(int element) {
        pointer++;
        array[pointer] = element;
    }

    public int pop() {
        int element = array[pointer];
        pointer--;
        return element;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    @Override
    public String toString() {
        String elements = "[";
        for (int i = 0; i <= pointer; i++) {
            if (elements.equals("["))
                elements += array[i];
            else
                elements += ", " + array[i];
        }
        elements += "]";
        return elements;
    }
}
