package com.hillel.courses.objects;

public class StringPalindromeMain {

    public static void main(String[] args) {

        String text = "hello, book, deleveled";
        StringPalindrom stringPalindrom = new StringPalindrom(text);

        int count = stringPalindrom.searchPalindrom();
    }
}
