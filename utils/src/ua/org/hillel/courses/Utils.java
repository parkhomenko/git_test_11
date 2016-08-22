package ua.org.hillel.courses;

import java.util.Scanner;

public class Utils {

    public static void main(String[] args) {
        System.out.println("asdfdasfdsf");
    }

    public static int[] getArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i + " of array: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.println(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
    }
}
