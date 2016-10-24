package com.courses.java.exceptions;

import java.io.FileNotFoundException;

public class ExceptionsTestJava {
    public static void main(String[] args) {

        ExceptionsTestJava testJava = new ExceptionsTestJava();

        try {
            testJava.readFileFromServer();
        } catch (NetworkException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFileFromServer() throws NetworkException, FileNotFoundException {
        if (networkRequest()) {
            throw new NetworkException("Can't reach remote server");
        }

        if (!isFileExists()) {
            throw new FileNotFoundException("Can't find the needed file");
        }

        //main logic of reading a file
    }

    private boolean networkRequest() {
        return false;
    }

    private boolean isFileExists() {
        return false;
    }
}
