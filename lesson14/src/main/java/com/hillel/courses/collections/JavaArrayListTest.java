package com.hillel.courses.collections;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayListTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(7);

        /*
        Iterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */

        /*
        for (String element : list) {
            System.out.println(element);
        }
        */
    }
}
