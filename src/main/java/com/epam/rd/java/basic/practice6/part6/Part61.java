package com.epam.rd.java.basic.practice6.part6;

import java.util.*;
import java.util.stream.Collectors;

public class Part61{

    public static void findThreeWordsWithMaxFrequency(List<String> words) {
        int counter = 0;

        Map<String, Long> hashMap = words.stream()
                .collect(Collectors.groupingBy(w -> w,Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e2, LinkedHashMap::new));

        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
            counter++;
            if (counter == 3) {
                break;
            }
        }
    }
}
