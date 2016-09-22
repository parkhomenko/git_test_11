package com.hillel.polymorphism.wrappers;

public class WrapperObjects {

    public static void main(String[] args) {
        int prim = 50;
        Integer i = Integer.valueOf(prim); //boxing
        int primitiveValue = i.intValue(); //unboxing

        Integer i1 = prim; //boxing
        int primitiveValue1 = i1; //unboxing

        String s1 = "50";
        int primitiveValue2 = Integer.parseInt(s1);
        Integer wrapper = Integer.valueOf(s1);

        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        System.out.println("Maximum: " + imax);
        System.out.println("Minimum: " + imin);

        //Character.isDigit()

        //Boolean.TRUE;

        Integer n1 = 500;
        Integer n2 = 500;

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        Integer n3 = 100;
        Integer n4 = 100;

        System.out.println(n3 == n4); // -128 .. 127

        n3 = 300;

        System.out.println(n4);
    }
}
