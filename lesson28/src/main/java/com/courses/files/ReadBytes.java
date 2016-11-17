package com.courses.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) {
        String path = "e:\\hello.txt";
        readFile(path);
    }

    private static void readFile(String path) {
        File file = new File(path);
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte value;
            while ((value = (byte) inputStream.read()) != -1) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
