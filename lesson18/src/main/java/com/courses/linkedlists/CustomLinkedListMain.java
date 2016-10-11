package com.courses.linkedlists;

public class CustomLinkedListMain {

    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");

        //list.introduceCycle(4);

        if (!list.hasCycle()) {
            System.out.println(list);
        }
    }
}
