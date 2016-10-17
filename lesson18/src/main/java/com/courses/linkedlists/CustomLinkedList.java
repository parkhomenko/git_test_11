package com.courses.linkedlists;

import java.util.Iterator;

public class CustomLinkedList<E> implements Iterable {

    private Node firstNode;
    private Node lastNode;

    @Override
    public Iterator iterator() {
        return null;
    }

    private class Node {
        E value;
        Node next;
    }

    public void add(E element) {
        Node node = new Node();
        node.value = element;

        if (firstNode == null) {
            firstNode = node;
            lastNode = node;
        } else {
            lastNode.next = node;
            lastNode = node;
        }
    }

    public void introduceCycle(int index) {
        Node current = firstNode;
        int currentIndex = 0;
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        lastNode.next = current;
    }

    public boolean hasCycle() {
        return false;
    }

    @Override
    public String toString() {
        String result = "[";
        Node current = firstNode;
        while (current != null) {
            if (result.equals("["))
                result += current.value;
            else
                result += ", " + current.value;
            current = current.next;
        }
        result += "]";
        return result;
    }
}
