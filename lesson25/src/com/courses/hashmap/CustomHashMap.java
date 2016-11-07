package com.courses.hashmap;

public class CustomHashMap {

    public static final int SIZE = 6;

    private Node[] elements;

    public CustomHashMap() {
        elements = new Node[SIZE];
    }

    public void put(Student key, Grade value) {
        int index = hash(key);

        Node node = new Node(key, value);

        if (elements[index] == null) {
            elements[index] = node;
            return;
        }

        Node current = elements[index];
        while (current.next != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        current.next = node;
    }

    public Grade get(Student key) {
        int index = hash(key);

        Node current = elements[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }

            current = current.next;
        }

        return null;
    }

    private int hash(Student key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    private class Node {
        private Student key;
        private Grade value;

        private Node next;

        public Node(Student key, Grade value) {
            this.key = key;
            this.value = value;
        }
    }
}
