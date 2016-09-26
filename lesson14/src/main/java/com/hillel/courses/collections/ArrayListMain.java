package com.hillel.courses.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

    public static void main(String[] args) {

        CustomList list = new CustomArrayList(5);
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);

        System.out.println();
        System.out.println("Iterator example");
        Iterator iterator = list.backwardIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
