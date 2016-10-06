package com.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringCollectionSorting {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("dog");
        strings.add("cat");
        strings.add("animal");

        System.out.println(strings);

        Collections.sort(strings);

        System.out.println(strings);
    }
}
