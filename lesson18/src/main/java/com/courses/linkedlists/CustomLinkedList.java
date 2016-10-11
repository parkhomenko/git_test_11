package com.courses.linkedlists;

public class CustomLinkedList {

    private Node firstNode;
    private Node lastNode;

    private class Node {
        String value;
        Node next;
    }

    public void add(String element) {
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
