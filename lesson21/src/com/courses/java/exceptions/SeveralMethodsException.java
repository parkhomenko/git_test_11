package com.courses.java.exceptions;

public class SeveralMethodsException {
    public static void main(String[] args) {
        SeveralMethodsException severalMethodsException =
                new SeveralMethodsException();
        try {
            severalMethodsException.methodFirst();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void methodFirst() throws Exception {
        methodSecond();
    }

    public void methodSecond() throws Exception {
        methodThird();
    }

    public void methodThird() throws Exception {
        throw new Exception("Something went wrong");
    }
}
