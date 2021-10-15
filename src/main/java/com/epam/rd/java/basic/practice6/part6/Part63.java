package com.epam.rd.java.basic.practice6.part6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Part63{
    String pathToFile;

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
            System.out.println(word);
            System.out.println();
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
