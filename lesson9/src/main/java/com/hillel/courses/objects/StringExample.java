package com.hillel.courses.objects;

public class StringExample {

    public static void main(String[] args) {

        String str = "hello";

        /*
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = str3.intern();

        System.out.println(str4 == str2);
        System.out.println(str3 == str2);
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str2));
        */

        char symbol = str.charAt(2);
        System.out.println(symbol);

        int count = getNumberOfSymbols('l', str);
        System.out.println("Number of symbols: " + count);

        String str2 = str + " world";
        System.out.println(str2);

        String str3 = str.concat(" world");
        System.out.println(str3);

        String str4 = "\"" + str3 + "\"";
        System.out.println(str4);

        String str5 = "   \"lots of spaces\"      ";
        System.out.println(str5);

        String str6 = str5.trim();
        System.out.println(str6);

        String str7 = str2.replace('h', 't');
        System.out.println(str7);

        String str8 = str2.substring(0, 5);
        System.out.println(str8);

        String str9 = "aeq be cv dwe es";
        String[] str10 = str9.split(" ");

        for (String s : str10) {
            System.out.println(s);
        }

        for (int i = 0; i < str10.length; i++) {
            System.out.println(str10[i]);
        }
    }

    public static int getNumberOfSymbols(char symbol, String string) {
        int cnt = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == symbol) {
                cnt++;
            }
        }
        return cnt;
    }
}
