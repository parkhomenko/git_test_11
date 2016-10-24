package com.courses.java.exceptions;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {

    }

    private void readFile() {
        File file = new File("e:\\1.txt");

        FileReader reader = null;

        try {
            reader = new FileReader(file);
            //System.exit(0);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void readWithResources() {
        File file = new File("e:\\1.txt");

        try (FileReader reader = new FileReader(file)) {
            reader.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
