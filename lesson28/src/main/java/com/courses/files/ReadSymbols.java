package com.courses.files;

import java.io.*;

public class ReadSymbols {
    public static void main(String[] args) {
        String path = "e:\\hello.txt";
        int[] symbols = readFile(path);

        writeFile("e:\\output.txt", symbols);
    }

    private static int[] readFile(String path) {
        File file = new File(path);
        try (FileReader fileReader = new FileReader(path)) {
            int symbol;
            int[] symbols = new int[(int) file.length()];
            int i = 0;
            while ((symbol = fileReader.read()) != -1) {
                symbols[i] = symbol;
                i++;
            }
            return symbols;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static void writeFile(String path, int[] symbols) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            for (int symbol : symbols) {
                fileWriter.write(symbol);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
