package com.epam.rd.java.basic.practice6.part6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

public class Part62 {
    String pathToFile;
    private static final Logger logger = Logger.getLogger(Part62.class.getName());

    public Part62(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public static void main(String[] args) {
        File file = new File("part6.txt");
        List<String> words = reader(file);
        words.sort(Comparator.comparing(String::length).reversed());
        for (int i = 0; i < 3; i++) {
            System.out.println(words.get(i) + " ==> " + words.get(i).length());
        }
    }

    public static List<String> reader(File file) {
        List<String> words = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String value = reader.readLine();
            while (value != null) {
                Collections.addAll(words, value.split(" "));
                value = reader.readLine();
            }
        } catch (IOException e) {
            logger.warning("IOException");
        }
        return words;
    }
}
