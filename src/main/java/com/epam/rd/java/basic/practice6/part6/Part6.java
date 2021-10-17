package com.epam.rd.java.basic.practice6.part6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Part6 {
    private static final Logger logger = Logger.getLogger(Part6.class.getName());

    public static void main(String[] args) {
        new Part6().inputFromConsole(args[0], args[1], args[2], args[3]);
    }

    public boolean inputFromConsole(String input, String fileName, String task, String operation) {
        if (!("--input".equals(input) || ("-i".equals(input)))) {
            System.err.println("Wrong input");
            return false;
        }

        if (!("--task".equals(task) || ("-t".equals(task)))) {
            System.err.println("Wrong task");
            return false;
        }

        switch (operation) {
            case "frequency":
                Part61.findThreeWordsWithMaxFrequency(reader(fileName));
                break;
            case "length":
                Part62.findThreeWordsWithMaxLength(reader(fileName));
                break;
            case "duplicates":
                Part63.findFirstThreeDuplicatedWords(reader(fileName));
                break;
            default:
                System.err.println("Wrong method!");
                return false;
        }
        return true;
    }

    public static List<String> reader(String filePath) {
        File file = new File(filePath);
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
