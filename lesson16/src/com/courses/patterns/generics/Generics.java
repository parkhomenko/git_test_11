package com.courses.patterns.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Object());
        list.add(5);
        list.add("something");
        list.add(new Dog());

        String str = (String) list.get(0);
        System.out.println(str);

        List<String> strList = new ArrayList<>();
        strList.add("string");
        strList.add("str1");
    }
}
