package org.hillel.courses.lesson10;

public class StringExample {

    public static void main(String[] args) {

        String hello = "hello" +
                "asdfdsf" +
                "wer" +
                "asdfdsf";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello");
        stringBuilder.append("asdfdsf");
        stringBuilder.append("wer");
        stringBuilder.append("asdfdsf");

        System.out.println(stringBuilder.toString());

        StringBuilder rev = stringBuilder.reverse();

        System.out.println(rev);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            builder.append(i);
        }
    }
}
