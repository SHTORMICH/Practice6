package com.epam.rd.java.basic.practice6.part6;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Part61{
    String pathToFile;
    //private static final Logger logger = Logger.getLogger(Part61.class.getName());

    public Part61(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public static void main(String[] args) {
        File file = new File("part6.txt");
        List<String> words = reader(file);
        Map<String, Long> hashMap = words.stream()
                .collect(Collectors.groupingBy(w -> w,Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e2, LinkedHashMap::new));
        int counter = 0;
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue() + "\n");
            counter++;
            if (counter == 3) {
                break;
            }
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
            e.printStackTrace();
        }
        return words;
    }
}
