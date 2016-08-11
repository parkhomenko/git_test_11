package ua.org.hillel.variables;

public class Variables {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //comment
        /* another comment */

        int i = 123213; //

        byte b = 127;
        b++; // b = b + 1

        System.out.println(b);
        String str = Integer.toBinaryString(b);

        System.out.println(str);

        short sh = 34;
        System.out.println(sh);

        long lg = 56;

        lg = sh;

        System.out.println(lg);

        sh = (short) lg;

        sh += 2; // sh = sh + 2;

        String someString = "Dog";
    }
}
