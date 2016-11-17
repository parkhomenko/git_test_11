package com.courses.files;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParseText {

    public static void main(String[] args) throws IOException {
        String path = "e:\\text.txt";

        FileReader reader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        Map<String, Integer> output = new HashMap<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (output.containsKey(word)) {
                    Integer value = output.get(word);
                    value++;
                    output.put(word, value);
                } else {
                    output.put(word, 1);
                }
            }
        }

        FileWriter writer = new FileWriter("e:\\output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        Set<String> keys = output.keySet();
        for (String key : keys) {
            Integer value = output.get(key);

            bufferedWriter.write(key + " " + value);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
