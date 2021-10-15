package com.epam.rd.java.basic.practice6.part6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Part63{
    String pathToFile;
    //private static final Logger logger = Logger.getLogger(Part63.class.getName());

    public Part63(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public static void main(String[] args) {
        File file = new File("part6.txt");
        List<String> words = reader(file);
        List<String> result = words.stream()
                .filter(w -> Collections.frequency(words, w) > 1)
                .limit(3)
                .collect(Collectors.toSet())
                .stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        Collections.reverse(result);
        for (String word : result) {
            char[] charArray = word.toCharArray();
            StringBuilder resultWord = new StringBuilder();
            for (int i = charArray.length - 1; i >= 0; i--) {
                resultWord.append(charArray[i]);
            }
            System.out.println(resultWord.append(System.lineSeparator()));
        }
    }

    public static List<String> reader(File file) {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String value = reader.readLine();
            while (value != null) {
                Collections.addAll(words, value.split(" "));
                value = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
}
