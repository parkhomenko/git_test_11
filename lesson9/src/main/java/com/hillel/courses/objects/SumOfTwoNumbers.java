package com.hillel.courses.objects;

public class SumOfTwoNumbers {

    public static void main(String[] args) {


    }

    public boolean bruteForceOption(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean optimize(int[] array, int sum) {
        int start, end;
        start = 0;
        end = array.length - 1;

        while (start != end) {
            int currentSum = array[start] + array[end];

            if (currentSum == sum) {
                return true;
            }

            if (currentSum > sum) {
                end--;
            } else {
                start++;
            }
        }

        return false;
    }

    public boolean linearOption(int[] array, int sum) {
        return false;
    }

    public int binarySearch(int[] array, int element) {
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;

            if (array[midIndex] == element) {
                return midIndex;
            }

            if (array[midIndex] > element) {
                highIndex = midIndex - 1;
            } else {
                lowIndex = midIndex + 1;
            }
        }

        return -1;
    }
}
