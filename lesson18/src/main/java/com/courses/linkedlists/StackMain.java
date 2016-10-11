package com.courses.linkedlists;

public class StackMain {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(5);
        stack.push(8);
        stack.push(9);
        stack.pop();
        stack.push(7);
        stack.pop();
        stack.pop();

        System.out.println(stack);
    }

    public String decToBin(int number) {

        Stack stack = new Stack();

        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        String str = "";
        while (!stack.isEmpty()) {
            str += stack.pop();
        }

        return str;
    }
}
